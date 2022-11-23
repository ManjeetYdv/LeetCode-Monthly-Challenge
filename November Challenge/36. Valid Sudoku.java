class Solution {
    public boolean valid(int row ,int col , char currchar  , char[][]board){

        //checking row and column and curr 3x3 square
        for(int i=0 ;i<9 ;i++){
            if(board[i][col]==currchar) return false;
            if(board[row][i]==currchar) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == currchar ) return false;
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {

        for(int i=0 ;i<board.length ;i++){
            for(int j=0 ;j<board[0].length; j++){
                if(board[i][j]!='.'){
                    char temp = board[i][j];
                    board[i][j]='.';
                    if(!valid(i ,j, temp , board)) return false;
                    board[i][j]= temp;
                }
            }
        }
        return true;
    }
}
