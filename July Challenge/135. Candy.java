class Solution {
    
    
    
    
    public int candy(int[] ratings) {
        
        int n= ratings.length;
        if(n==1) return 1 ;

        int[]left = new int[n];
        int[]right = new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right ,1);

        for(int i=1 ;i<n;i++){
            if(ratings[i]>ratings[i-1]) {
                left[i] =left[i-1]+1;
            }
        }
        for(int i=n-2 ;i>=0 ;i--){
            if(ratings[i]>ratings[i+1]){
                right[i] =right[i+1]+1;
            }
        }

        int result=0;
        for(int i =0 ;i<n ;i++){
            result += Integer.max(left[i] , right[i]);
        }
        return result;
        
        
        //code below is mine that fucks up on consecutive same ratings .....:
        
//        int[] candies = new int[arr.length];
//        Arrays.fill(candies , 1);

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i : arr){
//            pq.add(i);
//        }


//        while(!pq.isEmpty()){
           
//            int x = pq.remove();
//            if(x==0) continue;

//            int pos = idx(arr , x);


//            if(pos==0){
//                if(arr[0]>arr[1]){
//                    candies[0] =candies[1]+1;
//                }
//                continue;
//            }

//            if(pos==arr.length-1){
//                if(arr[pos]>arr[pos-1]){
//                    candies[pos]=candies[pos-1]+1;
//                }
//                continue;
//            }

//            if(arr[pos]>arr[pos-1] && arr[pos]>arr[pos+1]){
//                candies[pos] =  Integer.max(candies[pos-1] , candies[pos+1])+1;
//            }
//            else if(arr[pos]<arr[pos-1]&& arr[pos]<arr[pos+1]){

//            }
//            else candies[pos]=Integer.min(candies[pos-1] , candies[pos+1])+1;

//        }

//        int result=0;
//        for(int i:candies){
//           result+=i;
//        }
//         return result;

//     }
//     int idx(int[]arr ,int x){

//         for(int i= 0;i<arr.length ;i++){
//             if(arr[i]==x) return i;
//         }
//         return -1;
    }
    
}
