class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
      

            int prev1=0;
            int prev2=0;

            for(int i: cost){

                int temp=prev2;
                prev2 =i+Integer.min(prev1, prev2);
                prev1 =temp;
            }

            return Integer.min(prev1, prev2);

        
    }
}
