class Solution {
    public boolean isPossible(int[] arr) {
          if(arr.length==1){
              return arr[0]==1;        //true if its 1
          }

          PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

          int sum=0;
          for(int i:arr){
                pq.add(i);
                sum+=i;
          }

          while(pq.peek()!=1){

              int curr = pq.remove();          //pops the current peek element and assigns it to curr
              if(sum-curr==1) return true;     //Edge case where sum of all elements except curr is 1  , only  possible when n=2 , eg(1 , 4);

              int x = curr%(sum-curr);
              sum = sum-curr+x;
              if(x==0 || x==curr) {
                  return false;
              }

              pq.add(x);
          }

       return true;

    }
}
