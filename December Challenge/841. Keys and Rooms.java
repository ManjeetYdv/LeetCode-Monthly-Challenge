class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int[]vis = new int[rooms.size()]; //0 for unvisisted and 1 for visited
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
       
        while(!queue.isEmpty()){
            
            int size = queue.size();
            for(int i=0 ;i<size; i++){
                int currRoom = queue.poll();
                List<Integer> keys = rooms.get(currRoom);
                if(vis[currRoom]==1) continue;
                for(int key : keys){
                    queue.add(key);
                }
                vis[currRoom]=1;

            }
        }
        for(int i : vis) if(i==0) return false;
        return true;
    }
}
