class Solution {
    
      public int minimumLengthEncoding(String[] words) {
        
        Arrays.sort(words,(a,b) -> b.length()-a.length());     //Sorting in reverse order of length
          
        StringBuilder encoding=new StringBuilder();
          
        for(String s:words){
            if(encoding.indexOf(s+"#")==-1){
                encoding.append(s+"#");
            }
        }
        
        return encoding.length();
    }
    
}
