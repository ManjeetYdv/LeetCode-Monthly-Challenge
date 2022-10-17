class Solution {
    public boolean checkIfPangram(String sentence) {
    
       int [] present = new int[26];

       for(int i=0 ;i<sentence.length() ;i++) present[sentence.charAt(i)-'a']=1;

       for(int i=0 ;i<26 ; i++){
           if(present[i]==0) return false;
       }
       return true;

    //   return sentence.chars().distinct().count()==26; one liner
        
    }
}
