class Solution {
    
   
    
    public boolean isPowerOfFour(int n) {
        
//         if(n<1) return false;
        
//          while(true){
             
//              if(n==1) return true;
//              if(n%4!=0) return false;
//              n/=4;
    
//          }
        
        //Using maths
        //4^x = n  => x = log n/log 4
        //if x is an int return true else false
         double pow = Math.log(n)/Math.log(4);
         return pow ==(int)pow;
       
        
      
    }
}
