class Solution {
    
     public int search(int [][] grid , int i , int j){

        if(i<0 || j<0 || j>=grid[0].length || i>=grid.length){
            return 0;
        }
       if(grid[i][j]==0){
           return 0;
       }

       grid[i][j]=0; //so that cell wont be counted twice

       //return sum of result from left right up down and add1 for itself
       return (1 + search(grid ,i-1 , j) + search(grid , i+1 , j)+ search(grid , i , j-1) + search(grid , i ,j+1) );
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        
        
        int max=0;
        for(int i=0 ;i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ;j++){

                if(grid[i][j]!=0){
                    max = Integer.max(max , search(grid , i , j));
                }
            }
        }
        return max;
        
    }
}
