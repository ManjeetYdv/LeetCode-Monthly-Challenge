
class Solution {
  
    
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
          
        List<List<Integer>> res = new ArrayList<>();

        if(matrix==null ||  matrix.length==0 || matrix[0].length==0) return res;

        boolean[][] pacific = new boolean[matrix.length][matrix[0].length];
        boolean[][] atlantic = new boolean[matrix.length][matrix[0].length];

        //DFS
        for(int i=0 ;i<matrix.length ;i++){
            dfs(pacific , i , 0 , -1  , matrix);
            dfs(atlantic , i , matrix[0].length-1 , -1 ,matrix);
        }
        
        for(int i=0 ;i<matrix[0].length ;i++){
            dfs(pacific ,0 , i , -1, matrix);
            dfs(atlantic , matrix.length-1 , i , -1 ,matrix);
        }

        //preparing the result
        for(int i=0 ;i<matrix.length ;i++){
            for(int j=0 ;j<matrix[0].length ;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i , j));
                }
            }
        }

        return res;


        
    }
    
    public void dfs(boolean[][]ocean , int i ,int j  ,  int prev , int[][]matrix){
       
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length) return;
        if(matrix[i][j]<prev || ocean[i][j]) return;
        ocean[i][j] = true;

        dfs(ocean , i-1 , j , matrix[i][j] , matrix);
        dfs(ocean , i ,j-1 , matrix[i][j] , matrix);
        dfs(ocean , i+1, j , matrix[i][j] , matrix);
        dfs(ocean , i, j+1 , matrix[i][j] , matrix);

    }
    
      

  
}
