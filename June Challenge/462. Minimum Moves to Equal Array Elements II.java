class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        
        int minMoves=0;
        for(int i: nums){
            minMoves+=Math.abs(i-mid);
        }
        
        return minMoves;
    }
}
