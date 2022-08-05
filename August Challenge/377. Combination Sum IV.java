class Solution {
    
    //Recurrsive TLE->
    //   public int combinationSum4(int[] nums, int target) {
    //     if(target==0){
    //         return 1;
    //     }
    //     int res = 0;
    //     for(int i:nums){
    //         if(i<=target){
    //             res+=combinationSum4(nums,target - i);
    //         }
    //     }
    //     return res;
    // }
    
    
    //Optimized using memoziation (top-down)
    int[]dp ;
    public int func(int[] nums, int target){
        
       if(dp[target]>-1){
           return dp[target];
       } 
        
       int res =0 ;
       for(int i : nums){
            if(i<=target){
                res+=func(nums, target-i);
            }
        }
        
        dp[target]=res;
        return dp[target];
        
    }
    public int combinationSum4(int[] nums, int target) {
    
       dp = new int[target+1];
       Arrays.fill(dp , -1);
       dp[0]=1;      //will do the job of base case of recurssion
       func(nums , target);
       return dp[target];
    }
}
