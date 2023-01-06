class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int cost : costs) queue.add(cost);

        int res=0;
        while(!queue.isEmpty() && coins-queue.peek()>=0){
            coins-=queue.poll();
            res++;
        }
        return res;
    }
}
