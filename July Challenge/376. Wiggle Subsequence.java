class Solution {
    public int wiggleMaxLength(int[] arr) {
        
       if(arr.length==1) return 1;
       
        int up=1;
        int down=1;
        
        for(int i=1 ;i<arr.length ;i++){
            
            if(arr[i]>arr[i-1]) {
                up =down+1;
            }
            if(arr[i]<arr[i-1]){
                down =up+1;
            }
            
        }
        
        return Math.max(up , down);
        
    }
}
