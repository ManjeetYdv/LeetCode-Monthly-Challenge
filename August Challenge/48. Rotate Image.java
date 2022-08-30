class Solution {
    public void rotate(int[][] matrix) {
        
        int n= matrix.length;

        //creating transpose
        for(int i=0 ;i<n ;i++){
            for(int j=i+1 ;j<n; j++){

                int x = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =x;

            }
        }
        //reversing each row
        
        for(int[] i : matrix){
            for(int j=0 ;j<n/2 ; j++){

                int x = i[n-1-j];
                i[n-1-j] = i[j];
                i[j] = x;

            }
        }
        
    }
}
