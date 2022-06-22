class Solution {
    public int[][] transpose(int[][] arr) {
        
        int x = arr[0].length;
        int y= arr.length;

        int[][] trans = new int[x][y];

        for(int i=0;i<y ;i++){
           for(int j=0 ; j<x ;j++) {
               trans[j][i]= arr[i][j];

            }
        }
        return trans;
        
    }
}
