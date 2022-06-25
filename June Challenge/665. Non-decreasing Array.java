class Solution {
    
    
    public boolean checkPossibility(int[] arr) {
        
        int idx=-1;
        
        for(int i=0 ;i<arr.length-1 ;i++){
            
            if(arr[i]>arr[i+1]){
                
                if(idx!=-1) return false;
                idx =i;
            }
        }
        
        return idx==-1 || idx==0 || idx==arr.length-2 || arr[idx-1]<=arr[idx+1] || arr[idx]<=arr[idx+2];
       
        
    }
}
