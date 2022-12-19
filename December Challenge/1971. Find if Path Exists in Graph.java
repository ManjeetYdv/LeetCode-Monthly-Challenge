class Solution {
      
    public List<List<Integer>> getConnections(int n , int[][]edges){
        
        List<List<Integer>> list = new ArrayList<>(n);
            for(int i=0; i<n ;i++){
                list.add(i ,new ArrayList<>());
            }
            for(int[] edge : edges){
                int s = edge[0];
                int d = edge[1];
                list.get(s).add(d);
                list.get(d).add(s);
            }
            return list;
        }
    public boolean validPath(int n, int[][] edges, int source, int destination) {

            if(source==destination) return true;
            List<List<Integer>> connections = getConnections(n, edges);
            Queue<Integer> queue = new LinkedList<>();
            queue.add(source);
            int[]visited = new int[n]; //1 for not visited ,1 for visited

            while(!queue.isEmpty()){
                int size = queue.size();
                
                for(int i=0 ;i<size ;i++){
                    int node = queue.poll();
                    
                    List<Integer> paths = connections.get(node);
                    for(int d : paths){
                        if(d==destination) return true;
                        if(visited[d]==0) queue.add(d);
                    }
                    visited[node] = 1;
                }
            }

            return false;
    }
}
