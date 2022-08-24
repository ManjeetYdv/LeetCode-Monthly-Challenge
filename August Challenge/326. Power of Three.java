class Solution {
    public boolean isPowerOfThree(int n) {
      
        //Using while loop->
//          if(n<1) return false;
        
//         while(true){
            
//             if(n==1) return true;
//             if(n%3!=0) return false;
//             n/=3;
//         }
        
        
        //Using recurssion->
        if(n<1) return false;
        
        if(n==1) return true;
        if(n%3!=0) return false;
        
        return isPowerOfThree(n/3);      
    }
    
}
