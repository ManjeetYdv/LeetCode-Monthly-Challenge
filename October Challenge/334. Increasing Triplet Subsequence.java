class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int mid =Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;

        for(int num: nums){
            if(num> mid) return true;
            else if(left<num && num<mid) mid =num;
            else if(num<left) left = num;
        }
        return false;
    }
}
