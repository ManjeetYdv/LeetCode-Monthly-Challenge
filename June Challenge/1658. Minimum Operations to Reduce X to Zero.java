class Solution {
    public int minOperations(int[] arr, int x) {
         HashMap<Integer , Integer> map = new HashMap<>();

        int sum=0;
        int res =Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ;i++){
            sum+=arr[i];
            map.put(sum , i);
            
          
        }
        if(sum<x){
            return -1;
        }
        
        map.put(0 , -1);

        int t = sum-x;
        sum=0;

        for(int i=0 ;i<arr.length ;i++){
            sum+=arr[i];

            if(map.containsKey(sum-t)){
                res =Integer.max(res , i-map.get(sum-t));
            }
           
                  
            
        }

        return res==Integer.MIN_VALUE?-1:arr.length-res; 
    }
}
