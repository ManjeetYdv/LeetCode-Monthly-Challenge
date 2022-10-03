class Solution {

    public int minCost(String colors, int[] neededTime) {
        
        int start=0;
        int end=0;
        int totalTime=0;
        int n = colors.length();

        while(start<n && end<n){

            int localMax = 0;
            int groupTotal = 0;

            while(end<n && colors.charAt(start)==colors.charAt(end)){
                
                localMax = Math.max(localMax , neededTime[end]);
                groupTotal+= neededTime[end];
                end++;
            }

            totalTime+=(groupTotal-localMax);
            start=end;
        }

        return totalTime;
    }

    
}
