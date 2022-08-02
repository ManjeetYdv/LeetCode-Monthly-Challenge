class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
//     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

//         for(int []arr : matrix){
//             for(int i : arr){
//                 pq.add(i);
//                 if(pq.size()>k) pq.poll();
//             }
//         }

//         return pq.peek();
       int n = matrix.length;
       int low = matrix[0][0];
       int high = matrix[n-1][n-1];

       while(low<high){

           int mid = low + (high-low)/2;
           int count = lessEqual(matrix , mid);

           if(count<k) low = mid+1;
           else high = mid;
       }

       return low;
    }
    
     public int lessEqual(int[][] matrix , int t ){

        int count=0;
        int i= matrix[0].length-1;
        int j=0;

        while(i>=0 && j<matrix.length){

            if(matrix[i][j]>t){
                i--;
            }
            else{
                count+=i+1;
                j++;
            }
        }

        return count;

    }
}
