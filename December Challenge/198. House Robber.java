class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] robbed = new int[nums.length];
        robbed[0] = nums[0];
        robbed[1] = Integer.max(nums[0] , nums[1]);
        
        for(int i=2 ; i<nums.length ;i++)robbed[i] = Integer.max(nums[i]+ robbed[i-2] , robbed[i-1]);
        return robbed[nums.length-1];
    }
}
