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

//optmized
class Solution {
    public int specialArray(int[] nums) {
        int []count=new int[nums.length+1];
        for(int el : nums){
            if(el>=nums.length) count[nums.length]++;
            else count[el]++;
        }
        int sum=0;
        for(int i=nums.length;i>=0 ;i--){
            sum+=count[i];
            if(sum==i) return i;
        }
        return -1;
    }
}
