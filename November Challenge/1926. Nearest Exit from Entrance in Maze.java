class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m=maze.length;
        int n = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{entrance[0] , entrance[1] });
        maze[entrance[0]][entrance[1]] = '+';
        int steps=0;

        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0 ;i<size ;i++){
                int[]temp = queue.remove();
                int row = temp[0];
                int col = temp[1];
                
                if(row==0 || row==m-1 || col==0 || col ==n-1){  //exit conditions
                    if(!(row==entrance[0] && col==entrance[1])) return steps; //entrance must not be exit
                }
                if(row-1 >=0 && maze[row-1][col]=='.'){
                    maze[row-1][col] = '+';
                    queue.add(new int[]{row-1 , col});
                }
                if(row+1<m && maze[row+1][col]=='.'){
                    maze[row+1][col]= '+';
                    queue.add(new int[]{row+1 , col });
                }
                if(col-1>=0 && maze[row][col-1]=='.') {
                    maze[row][col-1]='+';
                    queue.add(new int[]{row , col-1});
                }
                if(col+1<n && maze[row][col+1]=='.') {
                    maze[row][col+1]='+';
                    queue.add(new int[]{row , col+1 });
                }
            }
            
            steps++;
        }
        return -1;
    }

}
