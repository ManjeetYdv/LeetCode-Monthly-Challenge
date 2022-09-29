class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
             
     //  Priority Queue Approach
        
//         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Math.abs(a-x)==Math.abs(b-x)?b-a : Math.abs(b-x)-Math.abs(a-x));
        
//         for(int i : arr){
//             pq.add(i);
//             if(pq.size()>k) pq.poll();
//         }
        
//         List<Integer> res = new ArrayList<>();
//         while(!pq.isEmpty()){
//             res.add(pq.peek());
//             pq.poll();
//         }
        
//         res.sort((a,b)->a-b);
//         return  res;
        
        
        
        // two-pointer approach
        
           List<Integer> list = new ArrayList<>();
        
            int i=0,j=arr.length - 1;
            while (j-i>= k){
                 if (Math.abs(arr[i]-x)>Math.abs(arr[j]-x)) i++;
                 else j--;
             }
        
             for (int a=i;a<=j;a++)
                 list.add(arr[a]);
             return list;
        
        
    }
}
