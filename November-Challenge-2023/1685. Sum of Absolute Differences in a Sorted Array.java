class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        // int[] res = new int[nums.length];
        // for(int i=0 ;i<nums.length ;i++){
        //     int sum=0;
        //     for(int j=0 ;j<nums.length ;j++){
        //         if(i!=j) sum+=Math.abs(nums[i]-nums[j]);
        //     }
        //     res[i] = sum;
        // }
        // return res;

        // HashMap<Integer , Integer> map = new HashMap<>();
        // int sum=0;
        // for(int i=0 ;i<nums.length ;i++){
        //     sum+=nums[i];
        //     map.put(i , sum);
        // }
        // map.put(-1 , 0);
        // map.put(nums.length ,0);

        // int[]res = new int[nums.length];
        // for(int i=0 ;i<nums.length ;i++){
        //     int suffixSum = map.get(nums.length-1) - map.get(i);
        //     int prefixSum = map.get(i-1);
            
        //     res[i] = (nums[i]*i - prefixSum) + (suffixSum - (nums[i]*(nums.length-1-i)));
        
        // }
        // return res;
        .
        int []res = new int[nums.length];
        int total=0;
        int n = nums.length;
        for(int ele : nums) total+=ele;

        int prefixSum=0;
        int suffixSum;
        for(int i=0 ;i<n ;i++){
            prefixSum+=nums[i];
            suffixSum = total - prefixSum;

            res[i] = (nums[i]*i - (prefixSum-nums[i])) + (suffixSum - (nums[i]*(n-1-i)));

        }
        return res;
        

    }
}
