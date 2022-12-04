class Solution {
    public int minimumAverageDifference(int[] nums) {

        long currSum=0;
        long totalSum=0;
        for(int i : nums) totalSum+=i;
        double minAvgDiff = Double.MAX_VALUE;
        int res=0;

        for(int i=0 ;i<nums.length ;i++){
            currSum+=nums[i];
            totalSum-=nums[i];

            double avgOfPrev = currSum/(i+1);
            double avgOfFront = i==nums.length-1?0 : totalSum/(nums.length-1-i);
            double absDiff =  Math.abs(avgOfPrev-avgOfFront);
            if(absDiff<minAvgDiff) {
                minAvgDiff = absDiff;
                res=i;
            }
        }
        return res;
    }
}
