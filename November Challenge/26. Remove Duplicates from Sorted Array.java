class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        
        int idx = 1;
        int prev =nums[0];
        for(int i=1 ;i<nums.length ;i++){
            if(nums[i]!=prev){
                prev = nums[i];
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}
