class Solution {
    
   public int concatenatedBinary(int n) {
        int modulo = 1000000007;
        
        long ans =0;
        for(int i=1; i<=n; i++){
            ans = (((ans<<(1+(int)(Math.log(i) / Math.log(2))))%modulo)+i)%modulo;
        }
        return (int)ans;
    }

    
//     public String decimalToBinary(int n){
//         String res="";
//         while(n>0){
//             res += (char)(n%2+'0');
//             n=n/2;
//         }
//         return  new StringBuilder(res).reverse().toString();
//     }
//     public int concatenatedBinary(int n) {

//         String binary="";
//         for(int i=1 ;i<=n ;i++){
//            binary+=decimalToBinary(i);
//         }

//        int base=1;
//        int res=0;

//        for(int i=binary.length()-1 ;i>=0 ;i--){
//             res += (int)(binary.charAt(i)-'0')*base;
//             res = res%1000000007;
//             base = (base*2)%1000000007;
//        }

//        return res;

//     }

   }
