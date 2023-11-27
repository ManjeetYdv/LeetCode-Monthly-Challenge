class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int ele : nums) {
            int diff = ele - reverseNum(ele);
            map.put(diff , map.getOrDefault(diff,0)+1);
        }
        int mod = 1000000007;
        int res=0;
        for(int key : map.keySet()){
            long count = map.get(key);
            long combinations = (count*(count-1)/2)%mod;
            res = (res+(int)combinations)%mod;
        }
        return res;
    }
    public int reverseNum(int num){
        int rev=0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev;
    }
}
