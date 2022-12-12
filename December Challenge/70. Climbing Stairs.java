class Solution {
  
   //recurssive - > 
  
    // private int helper(int n , int[]dp){
    //     if(n==0) return 1;
    //     if(n<0) return 0;
    //     if(dp[n]!=-1) return dp[n];
    //     return dp[n] = climbStairs(n-1) +climbStairs(n-2);
    // }
    // public int climbStairs(int n) {
    //     int dp[] = new int[n+1];
    //     Arrays.fill(dp , -1);
    //     return helper(n , dp);
    // }

     public int climbStairs(int n) {
        int prev1=1;
        int prev2=1;

        for(int i=2 ;i<=n ;i++){
            int temp = prev2;
            prev2 = prev2+prev1;
            prev1 = temp;
        }
        return prev2;

    }
}
