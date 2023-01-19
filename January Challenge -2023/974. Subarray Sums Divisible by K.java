class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , 1);

        int prefixSum=0;
        int res=0;

        for(int i : nums){
            prefixSum+=i;
            int mod = prefixSum%k;
            if(mod<0) mod+=k;
            if(map.containsKey(mod)) res+=map.get(mod);
            map.put(mod ,map.getOrDefault(mod , 0)+1);
        }
        return res;
    }
}
