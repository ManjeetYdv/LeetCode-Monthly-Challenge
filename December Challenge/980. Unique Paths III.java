class Solution {
  
    private int path(int[][] grid, int x, int y, int zero){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1) return 0;
        if(grid[x][y] == 2) return zero == 0 ? 1 : 0;

        grid[x][y] = -1;
        
        int totalCount = path(grid, x + 1, y, zero-1) + path(grid, x, y + 1, zero-1) +
                         path(grid, x - 1, y, zero-1) + path(grid, x, y - 1, zero-1);
        grid[x][y] = 0;
        return totalCount;
    }
    
    public int uniquePathsIII(int[][] grid) {
        int zeros = 0;
        int startI= 0;
        int startJ = 0 ;

        for(int i = 0; i < grid.length ; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0)   zeros++;
                   else if(grid[i][j] == 1){
                    startI= i;
                    startJ= j;
                    zeros++;
                }
            }
        }
        return path(grid, startI , startJ , zeros);
    }
}
