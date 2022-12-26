class Solution {
     public boolean helper(int index ,int[]nums , int[]dp){
        if(index== nums.length-1) return true;
        if(nums[index]==0) return false;
        if(index>=nums.length) return false;
        if(dp[index]!=-1){
            if(dp[index]==0) return false;
            if(dp[index]==1) return true;
        }
        int maxjumps = nums[index];
        for(int i=1;i<=maxjumps ;i++){
            if(helper(index +i, nums ,dp)) {
              dp[index]=1;
              return true;
            }
        }
        dp[index]=0;
        return false;

    }
    public boolean canJump(int[] nums) { 
        int dp[] = new int[nums.length];
        Arrays.fill(dp , -1);
        return helper(0 , nums , dp);
    }
}
