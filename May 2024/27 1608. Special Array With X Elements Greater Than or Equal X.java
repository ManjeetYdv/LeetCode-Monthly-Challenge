class Solution {
    int lowerBound(int []nums ,int el){
        int low=0;
        int n=nums.length;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=el){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<=n;i++){
            int count= n-lowerBound(nums,i);
            if(count==i) return i;
        }
        return -1;
    }
}
