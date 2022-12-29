class Solution {
    public int minStoneSum(int[] piles, int k) {
       
        //Failing!!!
        // PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // int totalPiles =0;
        
        // for(int i : piles){
        //     totalPiles+=i;
        //     while(i>0) {
        //         i = (int)Math.floor(i/2);
        //         queue.add(i);
        //     }
            
        // }
        // int removed = 0;
        // while(!queue.isEmpty() && k>0){
        //     k--;
        //     removed+=queue.poll();
        // }
        // return totalPiles-removed;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
      
        for(int i : piles){
            queue.add(i);
        }
        
        while(k>0){
            k--;
            int poll = queue.poll();
            queue.add(poll-(int)Math.floor(poll/2));
        }
        
        int res=0;
        while(!queue.isEmpty()) res+=queue.poll();
        return res;
    }
}
