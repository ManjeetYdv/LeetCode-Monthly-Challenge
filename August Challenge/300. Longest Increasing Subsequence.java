class Solution {
    
    int[][]dp;
    
   public int helper(int index , int prev_index  , int[] nums){
        
       if(index== nums.length){
           return 0;
       }
       if(dp[index+1][prev_index+1]>0){
           return dp[index+1][prev_index+1];
        }
       
       
       int len = 0 + helper(index+1 , prev_index , nums);
       
       if(prev_index ==-1 || nums[index]>nums[prev_index]){
           len = Math.max(len , 1 + helper(index+1 , index,  nums));
       }
                          
       return dp[index+1][prev_index+1]= len;       
    
  
     
    }
    
    public int lengthOfLIS(int[] nums) {
        
        dp = new int[nums.length+1][nums.length+1];
        for(int[] arr : dp){
            Arrays.fill(arr , -1);
        }
        return helper(0 ,-1 , nums);
        
    }
}
