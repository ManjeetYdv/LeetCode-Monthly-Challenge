class Solution {
    
      int mod = (int)1e9 + 7;
      Long[][][]memo = null;
    
     long func(int m , int n  , int maxMove , int currRow , int currColumn){


        if((currRow<0 ||  currColumn<0 || currRow>=m || currColumn>=n)  && maxMove>=0  ){
            return 1;
        }
        if(maxMove<=0) return 0;
         
        
        if(memo[currRow][currColumn][maxMove]!=null){
           return memo[currRow][currColumn][maxMove];
        }

        long sum=0;
        sum+=func(m , n, maxMove-1 , currRow-1 , currColumn);
        sum+=func(m , n, maxMove-1  , currRow , currColumn-1);
        sum+=func(m , n, maxMove-1 , currRow+1 , currColumn);
        sum+=func(m , n, maxMove-1 , currRow , currColumn+1);
      
        sum= sum %mod;
        memo[currRow][currColumn][maxMove]=sum;
        return sum;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        memo = new Long[m+1][n+1][maxMove+1];
        return (int)func(m ,n , maxMove, startRow , startColumn);
    }
}
