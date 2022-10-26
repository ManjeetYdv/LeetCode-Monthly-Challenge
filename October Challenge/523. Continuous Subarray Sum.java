class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        //logic is (Sum2 - Sum1)%k==0 => Sum2%k == Sum1%k
        //also we keeping and adding a prevSum so we can check fos subarrays with length >= 2
       HashSet<Integer> set = new HashSet<>();
       int currSum=0, prevSum=0;
       
       for(int i : nums){
           currSum = (currSum+i)%k;
           if(set.contains(currSum)) return true;

           set.add(prevSum);
           prevSum = currSum;
       }
       return false;
  }
}
