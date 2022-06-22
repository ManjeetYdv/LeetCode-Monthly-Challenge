class Solution {
    public int[] runningSum(int[] arr) {
        
          int[] sum = new int[arr.length];
        
        for(int i=0 ;i<arr.length ;i++){
            sum[i] = arr[i];
        }
        for(int i=1 ;i<sum.length ;i++){
            sum[i]+=sum[i-1];
        }
        return sum;
        
    }
}
