class Solution {
    public int[] answerQueries(int[] nums, int[] queries){
        // Arrays.sort(nums);
        // for(int i=1 ;i<nums.length ;i++) nums[i]+=nums[i-1];
        
        // int[]res = new int[queries.length];
        
        // int index=0;
        // for(int curr : queries){
        //     for(int i=0 ; i<nums.length ;i++){
        //         if(nums[i]>curr){
        //             res[index++] =i;
        //             break;
        //         }
        //         else if(i== nums.length-1) res[index++]= nums.length;
        //     }
        // }
        
        // return res;
        
        Arrays.sort(nums);
        TreeMap<Integer , Integer> map = new TreeMap<>();
        map.put(nums[0] , 0);
        for(int i=1 ;i<nums.length ;i++){
            nums[i]+=nums[i-1];
            map.put(nums[i] , i);
        }

        int[]res = new int[queries.length];
        int index=0;
        for(int i : queries){
            if(map.ceilingKey(i)!=null){
                if(map.ceilingKey(i)==i) res[index++] = map.get(map.ceilingKey(i))+1;
                else res[index++] = map.get(map.ceilingKey(i));
            }
            else res[index++] = nums.length;
        }
        
        return res;

    }
}
