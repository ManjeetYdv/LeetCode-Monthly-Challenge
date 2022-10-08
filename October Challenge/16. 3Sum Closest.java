class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int result = nums[0] + nums[1] +nums[2];

        for(int i=0; i<nums.length-2 ;i++){
            int curr= nums[i];

            int front = i+1;
            int back =nums.length-1;

            while(front<back){
                int sum= curr+nums[front]+nums[back];

                if(Math.abs(sum-target)<Math.abs(result-target)) result = sum;
                else if(Math.abs(sum-target)==Math.abs(result-target)) result=Math.max(result ,sum);
                
                if(sum==target) return sum;
                else if(sum>target) back--;
                else if(sum<target) front++;
            }
        }

        return result;
    }
}
