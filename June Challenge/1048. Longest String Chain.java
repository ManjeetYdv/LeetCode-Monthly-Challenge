class Solution {
    public int longestStrChain(String[] words) {
        
        
      Arrays.sort(words , (String a , String b)->a.length()-b.length());
      
        int maxlen =1;
        HashMap<String  , Integer> res = new HashMap<>();
        
        for(String word: words){
            
            int len =1;
            StringBuilder str = new StringBuilder(word);
            
            for(int i=0;  i<word.length() ; i++){
                
                 str.deleteCharAt(i);
                 String temp = str.toString();
                 
                 len = Integer.max(len , res.getOrDefault(temp , 0)+1);
                 str.insert(i , word.charAt(i));
                
            }
            
            res.put(word , len);
            maxlen = Integer.max(maxlen , len);
        }
        
        return maxlen;
    }
}
