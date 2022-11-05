class Solution {

    private class TrieNode {
        private TrieNode[] children;
        private String word;
        TrieNode(){
            children = new TrieNode[26];
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        int m= board.length, n = board[0].length;

        // System.out.println(" Value is " + root.children['o' -'c']);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(board,  i, j, root, res);
            }
        }
        return res;
    }

    public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        char c = board[i][j];
        if (c == ';' || p.children[c - 'a'] == null) return;
        p = p.children[c - 'a'];
        if (p.word != null) {   // found one
            res.add(p.word);
            p.word = null;     // de-duplicate
        }

        board[i][j] = ';';
        if (i > 0) dfs(board, i - 1, j ,p, res);
        if (j > 0) dfs(board, i, j - 1, p, res);
        if (i < board.length - 1) dfs(board, i + 1, j, p, res);
        if (j < board[0].length - 1) dfs(board, i, j + 1, p, res);
        board[i][j] = c;
    }


    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode p = root;
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (p.children[i] == null) p.children[i] = new TrieNode();
                p = p.children[i];
            }
            p.word = w;
        }
        return root;
    }

}
//Gives TLE

// class Solution {
    
//     private class memo{
//     String string;
//     int i;
//     int j;
//     public memo(String string , int i , int j){
//         this.string =  string;
//         this.i = i;
//         this.j = j;

//     }
// }
//     public List<String> findWords(char[][] board, String[] words) {
        
//         res = new HashSet<>();
//         Set<String> wordsSet = new HashSet<>();
//         wordsSet.addAll(Arrays.asList(words));
//         HashMap<memo , Boolean> map = new HashMap<>();
//         int m=board.length;
//         int n=board[0].length;

//         boolean[][]vis = new boolean[m][n];

//         for(int i=0 ;i<m ;i++){
//             for(int j=0 ;j<n ;j++){
//                dfs("" ,i , j , board , vis , wordsSet , map);
//             }
//         }
//         return res.stream().toList();
  
//     }

//     public boolean hasPrefix(String curr , Set<String> words){

//         for(String str : words){
//            if(str.startsWith(curr) )return true;
//         }
//         return false;
//     }

//     Set<String> res;
//     public void dfs(String curr , int i , int j  ,  char[][]board , boolean[][]vis , Set<String>words , HashMap<memo , Boolean> map){
        
//         if(map.containsKey(new memo(curr , i , j))) return;
//         if(!hasPrefix(curr , words) || curr.length()==10) return ;
//         if(words.contains(curr)) res.add(curr);

//         int m=board.length;
//         int n=board[0].length;
//         char ch = board[i][j];
//         vis[i][j]=true;
//         if(words.contains(curr+ch)) res.add(curr+ch);

//         if(j+1<n && !vis[i][j+1]) dfs(curr+ch ,i, j+1, board , vis , words  , map); //right
//         if(j-1>=0 && !vis[i][j-1]) dfs(curr+ch , i , j-1 ,board , vis , words , map);//left
//         if(i+1<m && !vis[i+1][j]) dfs(curr+ch , i+1 , j, board , vis , words , map); //down;
//         if(i-1>=0 && !vis[i-1][j]) dfs(curr+ch ,i-1 , j, board ,vis , words , map); //up

//         vis[i][j]= false;
//         map.put(new memo(curr ,i , j ) ,true);
//     }
// }
