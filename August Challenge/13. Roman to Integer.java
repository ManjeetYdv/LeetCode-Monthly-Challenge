class Solution {
    
    public int intValue(Character c){
        
        switch(c){
            
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
                
        }
        
        return 0;
       
    }
    public int romanToInt(String s) {
        
        int res=0;
        int prev =-1;
        
        for(int i=s.length()-1 ;i>=0 ;i--){
            int val=intValue(s.charAt(i));
            
            if(val>=prev) res+=val;
            else if(val<prev) res-=val;
            
            prev = val;
            
        }
        
        return res;
    }
}
