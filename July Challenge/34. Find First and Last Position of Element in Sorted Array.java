class Solution {

    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        int i =0;
        int j =nums.length-1;
        
        res[0] = -1;
        res[1] = -1;
        
        while(i<=j){
            
            int mid = i + (j-i)/2;
            
            if(nums[mid] == target){
                res[0] = mid;
                j = mid-1;      //to break the loop
            }
            else if(nums[mid] > target) j = mid-1;
            else i = mid+1;
        }
        
        i=0;
        j=nums.length-1;
        
        while(i<=j) {
            
            int mid = i + (j-i)/2;
            
            if(nums[mid]==target){
                res[1] = mid;
                i = mid+1;     //to break the loop
            }
            else if(nums[mid] > target) j = mid-1;
            else i = mid+1;
            
        }
        
        return res;
    }
    
}
