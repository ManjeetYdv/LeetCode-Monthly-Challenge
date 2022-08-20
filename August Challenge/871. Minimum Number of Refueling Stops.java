class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
       
        int xCurrent=startFuel;
        int numOfRefuels =0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int[] station : stations){
            int fuelAtThis = station[1];
            int StationX = station[0];
           
            while(xCurrent<StationX){
                  
                 if(pq.isEmpty()){
                    return -1;
                }
               int maxFuelAtThis = pq.remove();
               xCurrent+=maxFuelAtThis;
               numOfRefuels++;

            }
          pq.offer(fuelAtThis);

        }

        while(xCurrent<target){
            if(pq.isEmpty()) return -1;
            int maxFuel = pq.remove();
            xCurrent+=maxFuel;
            numOfRefuels++;
        }
        
        return numOfRefuels;
        
        
    }
}
