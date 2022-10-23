class Solution {
    public int[] findErrorNums(int[] nums) {
       
       
        // Set<Integer> set = new HashSet<>();
        // int sum=0;
        // int[]res = new int[2];
        // for(int i : nums){
        //     if(set.add(i)) sum+=i;
        //     else res[0]=i;
        // }
        // int n= nums.length;
        // res[1] = n*(n+1)/2 -sum;
        
        // return res;

        int[]res = new int[2];

        for(int i=0 ;i<nums.length ;i++){
            if(nums[Math.abs(nums[i])-1]<0) res[0] = Math.abs(nums[i]);
            else nums[Math.abs(nums[i])-1]*=-1;
        }

        for(int i=0;i<nums.length ;i++){
            if(nums[i]>0) {
                res[1] = i+1; 
                break;  
            }
        }
        
        return res;
    }
}
