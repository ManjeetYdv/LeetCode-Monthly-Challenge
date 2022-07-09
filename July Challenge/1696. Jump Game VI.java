class Solution {
    
   
    
    public int maxResult(int[] arr, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a , b)->b[1]-a[1]);
        
        int max=arr[0];
        pq.add(new int[]{0 ,max});
        
        for(int i=1 ;i<arr.length ;i++){
            
            while(i-pq.peek()[0]>k){
                pq.poll();
            }
            
            int[]top = pq.peek();
            max =arr[i]+top[1];
            
            pq.add(new int[]{i ,max});
            
        }
        
        return max;
        
        
    }
}
