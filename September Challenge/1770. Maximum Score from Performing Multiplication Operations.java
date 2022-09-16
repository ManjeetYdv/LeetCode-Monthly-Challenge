class Solution {

    public int dpHelper(int index , int left , int right , int[]nums , int[] multipliers , int [][]dp){
        
        if(index==multipliers.length){
            return 0;
        }
       if(dp[index][left]!=Integer.MIN_VALUE) return dp[index][left];
        
        int i= multipliers[index]*nums[left] + dpHelper(index+1 , left+1 , right , nums , multipliers , dp);
        int j= multipliers[index]*nums[right] + dpHelper(index+1 , left , right-1, nums ,multipliers , dp);
        
        return dp[index][left] = Math.max(i ,j);
  
    }

    public int maximumScore(int[] nums, int[] multipliers) {
       
        int[][]dp = new int[multipliers.length][nums.length];
        for(int[] arr:  dp){
            Arrays.fill(arr , Integer.MIN_VALUE);
        }
        return dpHelper(0, 0 ,nums.length-1 , nums , multipliers ,dp);




    }
}
