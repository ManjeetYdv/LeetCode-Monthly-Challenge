class Solution {
    
    private int helper(int index , int buy  , int[]prices , int[][]dp){

        if(index>=prices.length) return 0;
        if(dp[index][buy]!=-1) return dp[index][buy];
        //buy
        if(buy==1){
            return dp[index][buy] = Integer.max(-prices[index] + helper(index+1 , 0 , prices , dp) , helper(index+1 , 1 , prices ,dp));
        }
        //sell
        return dp[index][buy] = Integer.max(prices[index]+ helper(index+2 , 1 , prices , dp) , helper(index+1 , 0 , prices , dp));
    }
    public int maxProfit(int[] prices) {
        int[][]dp = new int[prices.length][2];
        for(int[]arr : dp) Arrays.fill(arr , -1);
        
        return helper(0 , 1, prices , dp);
    }
}
