class Solution {
    Set<List<Integer>> set = new HashSet<>();
    List<List<Integer>> res ;

    public void helper(int index , int prev , int[]nums ,List<Integer> list){
        if(index==nums.length){
           if(list.size()>1 && set.add(new ArrayList<>(list))) res.add(new ArrayList<>(list));
           return;
        }
        if(nums[index]>=prev){
            list.add(nums[index]);
            helper(index+1 , nums[index] , nums , list);
            list.remove(list.size()-1);
        }

        helper(index+1 , prev , nums , list);

    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        res = new ArrayList<>();
        helper(0 , -101  , nums , new ArrayList<>());
        return res;
    }
}
