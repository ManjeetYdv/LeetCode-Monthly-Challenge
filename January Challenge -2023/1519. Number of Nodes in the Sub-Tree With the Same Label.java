class Solution {
     public int[]  helper(int curr , List<List<Integer>>adjacency , boolean[]visited  , int[]res , String labels ){
       //bro i just solved and submitted this and idk bc HOW!!!!
        if(adjacency.get(curr).size()==0){
            int[] label = new int[26];
            label[labels.charAt(curr)-'a']++;
            res[curr] = label[labels.charAt(curr)-'a'];
            return label;
        }

        int[]label = new int[26];
        visited[curr]=true;
        List<Integer> edges = adjacency.get(curr);
        for(int i : edges){
           if(visited[i]==false) {
               int[]a  =helper(i , adjacency , visited , res , labels );
               for(int x=0 ; x<26 ;x++) label[x]+=a[x];
           }
        }
        visited[curr]=false;
        label[labels.charAt(curr)-'a']++;
        res[curr] = label[labels.charAt(curr)-'a'];
        return label;
    }
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        List<List<Integer>> adjacency = createAdjacency(n , edges);
        boolean[]visited =  new  boolean[n];
        int []res = new int[n];
        int[] label = new int[26];

        helper(0,  adjacency , visited , res , labels );
        
        return res;
    }

    private List<List<Integer>> createAdjacency(int n , int[][]edges){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0 ;i<n ;i++) list.add(i , new ArrayList<>());

        for(int [] edge : edges){
            int u= edge[0];
            int v= edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        return list;
    }
}
