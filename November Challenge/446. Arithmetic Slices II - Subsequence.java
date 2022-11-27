class Solution {
     
    public int solve(int nums[], int index, long diff , HashMap<String, Integer> memo){

        if(index==nums.length) return 0;
        int local = 0;
        String key = index + "-" + diff;

        if (memo.containsKey(key))
            return (memo.get(key));
      
        for (int i = index; i < nums.length; i++){
            if ((long)nums[i] - (long)nums[index-1] == diff)  //index-1 = j;
                local += 1+ solve(nums, i+1, diff, memo);
        }
        memo.put(key, local);
        return local;
    }
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int res = 0;
       
        for (int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                HashMap<String, Integer> memo = new HashMap<>();
                res += solve(nums, j+1,  (long)nums[j] - (long)nums[i], memo);
            }
        }
        return res;
        
    }


}
