class Solution {
   
   public int sumSubarrayMins(int[] arr) {
        int[]prev_lesser = new int[arr.length];
        int[]next_lesser_or_equal =  new int[arr.length];
        Arrays.fill(next_lesser_or_equal ,arr.length);
        Stack<Integer> stack = new Stack<>();

        for(int i=0 ;i<arr.length ;i++){
            //pop everything that violates increasing stack property
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                //whenever an element pops and element ...the element is next lesser or equal to the popped element
                next_lesser_or_equal[stack.pop()] = i ;
            }
            //with all greater and equal being popped , element at topof stack will be previous lesser elenment to current
            prev_lesser[i] = stack.size()==0 ?-1 : stack.peek();
            stack.push(i);
        }
        long res =0;
        double mod = 1e9+7;
        for(int i=0 ;i<arr.length ;i++){
            long left = i-prev_lesser[i];
            long right = next_lesser_or_equal[i]-i;;
            res += arr[i]*left*right;
            res%=mod;
        }

        return (int) res;

    }
    
}
