class Solution {
    public int longestConsecutive(int[] arr) {
        
       if(arr.length<=1)  return arr.length;
        
       Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }

        int max =1;
        
        for(int i =0 ;i<arr.length ;i++){

            if(!set.contains(arr[i]-1)){

                int currElement =arr[i];
                int currCount=0;

                while(set.contains(currElement)){
                    currCount++;
                    currElement++;
                }
                max = Integer.max(max ,currCount);
            }

        }
        return max;
    }
}
