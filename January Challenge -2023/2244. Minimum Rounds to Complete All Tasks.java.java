class Solution {
     public int minimumRounds(int[] tasks) {

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int task : tasks) map.put(task , map.getOrDefault(task ,0)+1);

        int res=0;
        for(int key : map.keySet()){
            int numTask = map.get(key);
            if(numTask==1) return -1;
            res+=(numTask+2)/3;
        }
        return res;
     }

     //DP solution (failed on a testcase)
     
    //  public int minimumRounds(int[] tasks) {

    //     HashMap<Integer , Integer> map = new HashMap<>();
    //     for(int task : tasks) map.put(task , map.getOrDefault(task ,0)+1);

    //     int res=0;
    //     for(int key : map.keySet()){
    //         int numTask =  map.get(key);
    //         int[]dp = new int[numTask+1];
    //         Arrays.fill(dp , -1);
    //         int minCuts = helper(numTask , 1 , dp);

    //         if(minCuts==Integer.MAX_VALUE) return -1;
    //         else res+=minCuts;
    //     }

    //     return res;
    // }
    // public int helper(int n , int steps , int[]dp){  //best partition
    //     if(n-2==0 || n-3==0) return steps;
    //     else if(n-2<0) return Integer.MAX_VALUE;
    //     if(dp[n]!=-1) return dp[n];

    //     int minCuts = Integer.MAX_VALUE;
    //     minCuts = Integer.min(helper(n-2  , steps+1 , dp) , minCuts);
    //     minCuts = Integer.min(helper(n-3  , steps+1 , dp) , minCuts);
    //     return dp[n] =minCuts;
    // }
}
