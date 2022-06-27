class Solution {
    
    
    public int[] twoSum(int[] arr, int target) {
        
        int[] result = new int[2];
        int start =0;
        int end= arr.length-1;
        
        while(start<=end){
            int sum = arr[start]+arr[end];
            
            if(sum==target){
                result[0]=start+1;
                result[1]=end+1;
                break;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        
        return result;
        
    }
}
