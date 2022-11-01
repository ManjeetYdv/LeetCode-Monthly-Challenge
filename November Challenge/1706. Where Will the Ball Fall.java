class Solution {
   public int[] findBall(int[][] grid) {


        int m = grid.length;
        int n =grid[0].length;

        int[]res = new int[n];

        for(int col=0 ;col<n ;col++){
            int curr=col;
            for(int row=0 ;row<m ;row++) {

                if (getStuck(row, curr, grid)) res[col] = -1;
                else {
                    if (grid[row][curr] == 1) curr = curr + 1;
                    if (grid[row][curr] == -1) curr = curr - 1;
                }
            }

            if(res[col]==0) res[col]=curr;
        }

        return res;
    }
    

    public boolean getStuck(int row , int curr , int[][]grid){
        
       
        return (curr==0 && grid[row][curr]==-1) ||
                (curr==grid[0].length-1 && grid[row][curr]==1) ||
                (grid[row][curr]==1 && grid[row][curr+1]==-1) ||
                (grid[row][curr]==-1 && grid[row][curr-1]==1);
                

    }
}
