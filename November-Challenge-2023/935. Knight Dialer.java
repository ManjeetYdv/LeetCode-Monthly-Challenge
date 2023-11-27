class Solution {
    int[][] directions = {{2,-1} , {2 ,1} ,{-2 , -1} ,{-2, 1}, {-1 ,-2} ,{1,-2} , {-1,2} ,{1,2}};
    int mod = 1000000007;
    public int knightDialer(int n) {
        int res=0;
        
        int dp[][][] = new int [4][3][n+1];
        for(int arr[][] : dp){
            for(int a[] :arr) {
                Arrays.fill(a , -1);
            }
        }
        
        for(int i=0 ;i<4 ;i++){
            for(int j=0 ;j<3 ;j++){
                if((i==3 && j==0) || (i==3 && j==2)) continue;
                res = (res + helper(i , j, 1 , n , dp) )%mod;
            }
        }
        return res;
    }
    public int helper(int i , int j , int count , int n , int dp[][][]){
        if(i<0 || j<0 || i>3 || j>2) return 0;
        if((i==3 && j==0) || (i==3 && j==2)) return 0;
        if(count==n) return 1;
        if(dp[i][j][count]!=-1) return dp[i][j][count];

        int res=0;
        for(int d[] : directions){
            res= (res+ (helper(i+d[0] , j+d[1] , count+1 ,n ,dp)))%mod;
        }
        return dp[i][j][count] = res;

    }
}
