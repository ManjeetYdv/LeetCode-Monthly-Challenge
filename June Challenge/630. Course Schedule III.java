class Solution {
    public int scheduleCourse(int[][] arr) {
        
        int workedDays =0;
        Arrays.sort(arr , (a , b)->a[1]-b[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int[]a :arr){
            workedDays+=a[0];
            pq.add(a[0]);

            if(workedDays>a[1]){
                workedDays-=pq.peek();
                pq.poll();

            }

        }

        return pq.size();
    }
}
