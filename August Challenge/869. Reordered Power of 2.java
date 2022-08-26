class Solution {
    
//     Main logic is calculating all powers of 2 less than 10^9 i.e 2^0 - 2^29
// and sort the values and add them to set
// We will sort in decreasing order to avoid edges cases and some extra checks
// ( Cases like - 10 , here sorted it will be 01 or 1 and set will have 1 (2^0) and function will return true.. not false )

// After filling the set
// We will do the same to the number to be checked... sort it in decreasing order

// we will return true if the new number is there is set else false;

// It works but needs optimization and i m too lazy to learn bit manupulation rn
    
    
    public boolean reorderedPowerOf2(int n) {
        
       Set<Integer> set = new HashSet<>();
        for(int i=0 ;i<30 ;i++){
            set.add(powerOfTwo(i));
        }

        List<Integer> ls = new ArrayList<>();
        while(n>0){
            ls.add(n%10);
            n/=10;
        }
        ls.sort((a , b)->b-a);

        int num = 0;
        
        for(int i : ls){
            num = num*10 +i;
        }

        return set.contains(num);
    }
    
    
      public int powerOfTwo(int n){

        List<Integer> list = new ArrayList<>();

        int res = 1;

        for(int i=1 ;i<=n ;i++){
            res*=2;
        }

        while(res>0){
            list.add(res%10);
            res/=10;
        }

        list.sort((a,b)->b-a);

        int num = 0;
          
        for(int i :list){
            num = num*10 + i;
        }

        return num;

    }
}
