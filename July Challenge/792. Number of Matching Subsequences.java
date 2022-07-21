class Solution {
     public boolean isSubsequence(String s, String t) {
     
        if(s.length()==0) return true;
        if(t.length()==0) return false;
        
        int idx=0;
        Character c =s.charAt(idx);
        
        for(int i= 0; i<t.length() ;i++ ){
            
            if(c==t.charAt(i)){
                
                idx++;
                if(idx==s.length())return true;
                c = s.charAt(idx);
            }
          
        }
        
        return false;
    }
    
    public int numMatchingSubseq(String s, String[] words) {
        
    if(s.length()==0|| words.length==0) return 0;
        
       HashMap<String , Integer> map = new HashMap<>();
       for(String word: words){
            map.put(word  , map.getOrDefault(word , 0)+1);
            
        }  
        
      int count=0;
        for(String word : map.keySet()){
           
            if(isSubsequence(word , s))count+=map.get(word);
        }

        return count;
    }
}
