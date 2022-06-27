class Solution {
    
    static int ExpandFromCenter(String str , int i , int j){
        
        while(i>=0 && j<str.length()){
            
            if(str.charAt(i)==str.charAt(j)){
                i--;
                j++;
            }
            else break;
        }
        
        return j-i-1;
        
    }
    public String longestPalindrome(String s) {
        
        int start=0;
        int end=0;
        
        for(int i=0 ;i<s.length() ;i++){
            
            int l1 = ExpandFromCenter(s , i , i+1);
            int l2 = ExpandFromCenter(s , i , i);
            
            int len = Integer.max(l1 , l2);
            
            if(end - start < len){
                
                start =i-(len-1)/2;
                end =i+len/2;
            }
        }
        
        return s.substring(start , end+1);
        
    }
}
