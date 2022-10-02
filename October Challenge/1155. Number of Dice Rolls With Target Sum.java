class Solution {
    
    public int helper (int dice ,  int k , int curTarget , int[][]dp ){
        
        
        if(curTarget==0 && dice!=0) return 0;
        if(dp[dice][curTarget]!=-1) return dp[dice][curTarget];
        if(dice==0){
            if(curTarget==0){
               return 1;
            }
            return 0;
        }

        int ways=0;
        for(int i=1; i<=k ;i++){
           if(curTarget-i>=0) ways = (ways+ helper(dice-1 , k ,curTarget-i , dp))%1000000007;
            }
        
        return dp[dice][curTarget] = ways;


    }
    public int numRollsToTarget(int n, int k, int target) {
       
        int[][] dp = new int[31][1001];
        for(int []arr : dp){
            Arrays.fill(arr , -1);
        }

        return helper(n , k , target , dp);
    }
}
