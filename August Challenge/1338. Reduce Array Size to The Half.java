class Solution {
    public int minSetSize(int[] arr) {
        
        
        HashMap<Integer , Integer> map= new HashMap<>();
        for(int i : arr) map.put(i , map.getOrDefault(i , 0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Max-Heap

        for(int i : map.keySet()) pq.add(map.get(i));

        int setRemove = 0;
        int itemRemoved=0;

        while(!pq.isEmpty()){
            setRemove++;
            itemRemoved+=pq.remove();
            if(itemRemoved>=arr.length/2) break;
        }
        return setRemove;

    }
}
