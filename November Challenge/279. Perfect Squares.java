class Solution {
    
    public int helper( int num , int[]dp){
        if(dp[num]!=-1) return dp[num];
        if(num==0) return 0;

        int res = Integer.MAX_VALUE;
        for(int i=1 ;i<=(int)Math.sqrt(num) ;i++){
           res = Math.min(res ,1+ helper(num-i*i  ,dp)) ;
        }
        return dp[num] = res;

    }
    public int numSquares(int n) {

        int[]dp = new int[n+1];
        Arrays.fill(dp , -1);
        return helper(n, dp);



    }
   
}
