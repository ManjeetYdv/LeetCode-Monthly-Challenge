class Solution {
    public int numSteps(String s) {
        int carry=0;
        int moves=0;
        for(int i=s.length()-1 ;i>=1 ;i--){
            int val = s.charAt(i)-'0';
            // if(val+carry==0) moves+=1;
            // else if(val+carry==1){
            //     carry=1;
            //     moves+=2;
            // }
            // else if(val+carry==2){
            //     carry=1; 
            //     moves+=1;
            // }
            // in case of sum 0 and 2 carry remains same and moves+=1 , code can be reduced using %2
            if((val+carry)%2==1) {
                moves+=2;
                carry=1;
            }
            else moves+=1;
        }
        int val = s.charAt(0)-'0';
        if((val+carry)%2==0) moves+=1;
            
        return moves;
    }
}
