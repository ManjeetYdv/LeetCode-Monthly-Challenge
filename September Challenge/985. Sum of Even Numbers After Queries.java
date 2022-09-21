class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
    
        int[] res = new int[queries.length];
        int idx=0;
        int sum= sumofEven(nums);
        for(int[] query : queries){
        
            if(nums[query[1]]%2==0) sum-=nums[query[1]];
            nums[query[1]]+= query[0];
            if(nums[query[1]]%2==0) sum+=nums[query[1]];
            res[idx++] = sum;

        }

        return res;
    }
    
      public int sumofEven(int[] arr){

        int sum=0;
        for(int i : arr){
            if(i%2==0) sum+=i;
        }
        return sum;
    }
}
