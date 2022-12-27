class Solution {
    
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int res=0;
        
        for(int i=0 ;i<capacity.length ;i++){
            if(capacity[i]==rocks[i]) res++;
            else queue.add(capacity[i]-rocks[i]);
        }
        
        while(!queue.isEmpty() && queue.peek()<=additionalRocks){
            additionalRocks-=queue.poll();
            res++;
        }
        return res;
    }
}
