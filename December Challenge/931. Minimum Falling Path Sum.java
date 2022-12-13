class Solution {
      
    public int helper(int i , int j  , int[][]matrix , int[][]dp){
        if(i==matrix.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        
        int res = Integer.MAX_VALUE;
        if(j-1>=0) res = Integer.min(res , matrix[i][j] + helper(i+1, j-1 , matrix , dp));
        if(j+1<matrix[0].length) res = Integer.min(res , matrix[i][j] + helper(i+1 , j+1  , matrix , dp));
        res = Integer.min(res , matrix[i][j]+helper(i+1 , j  , matrix  , dp));
        
        return dp[i][j] = res;
                
        
    }
    public int minFallingPathSum(int[][] matrix) {
        
        int[][]dp = new int[matrix.length+1][matrix[0].length+1];
        for(int[]arr : dp) Arrays.fill(arr , -1);
        int min = Integer.MAX_VALUE;
        for(int i=0 ;i<matrix[0].length ;i++){
            min = Integer.min(min , helper(0 , i , matrix , dp));
        }
        
        return min;

    }
}
