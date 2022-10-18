class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String a ="1";
        
        for (int i = 1; i < n; i++) {    
            String b= "";
            
            for(int j=0 ;j<a.length() ;j++){  
                char c = a.charAt(j);
                int count=0;
                int k=j;
                
                for(k=j ;k<a.length();k++){
                    if(a.charAt(k)==c) count++;
                    else break;
                }
                b+=Integer.toString(count)+c;
                j=k-1;
            }
            
            a=b;
        }
        
        return a;

    }
}
