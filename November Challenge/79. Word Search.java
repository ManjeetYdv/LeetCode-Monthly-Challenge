class Solution {
    private boolean helper(int i , int j , char curr , int currlen , char[][]board , String word){
        if(curr!=word.charAt(currlen-1)) return false;
        if(currlen==word.length()) return true;
        
        int m = board.length;
        int n = board[0].length;
        char temp = board[i][j];
        board[i][j] = '.';
        if(i-1>=0){
            if(helper(i-1 , j  , board[i-1][j] , currlen+1 , board , word)) return true;
        }   
        if(i+1<m){
            if(helper(i+1, j, board[i+1][j] , currlen+1 , board , word)) return true;
        }
        if(j-1>=0) {
            if(helper(i , j-1 , board[i][j-1] ,currlen+1 ,board, word)) return true;
        }
        if(j+1<n) {
            if(helper(i , j+1 , board[i][j+1] , currlen+1 , board , word)) return true;
        }
        board[i][j] = temp;
        return false;
       
    }

    public boolean exist(char[][] board, String word) {
        
        for(int i=0 ;i<board.length ;i++){
            for(int j=0 ;j<board[0].length ;j++){
                if(board[i][j]==word.charAt(0)){
                  if(helper(i, j, board[i][j] ,1 , board , word) ) return true;  
                }
            }
        }
        return false;
    }
}
