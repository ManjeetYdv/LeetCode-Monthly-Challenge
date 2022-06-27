class Solution {
    
    
    public int maximumUniqueSubarray(int[] arr) {
        
        HashMap<Integer , Integer> presum =new HashMap<>();
        presum.put(-1 ,0);
        int sum=0;
        for(int i=0 ;i<arr.length ;i++){
            sum+=arr[i];
            presum.put(i ,sum);
        }

        HashMap<Integer , Integer> lastOcc = new HashMap<>();

        int left=0;
        int right=0;
        int maxSum=0;

        while(right<arr.length){

            if(lastOcc.containsKey(arr[right])){
                left = Integer.max(left , lastOcc.get(arr[right])+1 );

            }
         
            maxSum = Integer.max( maxSum , presum.get(right)-presum.get(left-1));
            lastOcc.put(arr[right] , right);
            right++;

        }
        
        return maxSum;
        
    }
}
