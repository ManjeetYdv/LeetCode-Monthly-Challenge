class Solution {
    public int largestPerimeter(int[] nums) {
        
      Arrays.sort(nums); // sort element and select largest sides to maximize perimeter.
      for(int i=nums.length-1;i>1;i--) {
            if(nums[i] < nums[i-1] + nums[i-2])  return nums[i] + nums[i-1] + nums[i-2];
      }
      return 0;
        
        

    }
}
