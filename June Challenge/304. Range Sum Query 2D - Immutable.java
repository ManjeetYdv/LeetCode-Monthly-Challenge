class NumMatrix {
    
    final int prefix[][];
    
    public NumMatrix(int[][] matrix) {
        
    this.prefix = new int[matrix.length +1][matrix[0].length +1];
        for(int i =0; i < matrix.length; i++) {
            int rowSum =0;
            for(int j =0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
                prefix[i+1][j+1] = rowSum;
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int rangesum=0;
        for(int i=row1+1 ;i<=row2+1 ;i++){
            rangesum = rangesum + prefix[i][col2+1] - prefix[i][col1];
        }
        return rangesum;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
