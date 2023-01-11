class Solution {
      public int helper(int curr,  List<List<Integer>> adjacency  , List<Boolean> hasApple , boolean[]visited){
        if(adjacency.get(curr).size()==0) {
            if (hasApple.get(curr)) return 1;
            return 0;
       }

        visited[curr]=true;
        int res=0;
        List<Integer> list = adjacency.get(curr);
        for(int i:  list){
           if (visited[i]==false) res+=helper(i,  adjacency , hasApple , visited);
        }

        visited[curr]=false;
        if(hasApple.get(curr) || res>0) res+=1;
        return res;
    }

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adjacencyList = createAdjacency(n , edges);
        boolean[] visited = new boolean[n];
       
        int min_time =  helper(0 , adjacencyList , hasApple , visited);
        if (min_time==0)return 0;
        return (min_time-1)*2;
    }

    public  List<List<Integer>> createAdjacency(int n , int[][]edges){
        List<List<Integer>> list =  new ArrayList<>();
        for(int i=0 ;i<n ;i++) list.add(i , new ArrayList<>());

        for(int [] edge : edges){
            int u  = edge[0];
            int v = edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }

        return list;
    }
}
