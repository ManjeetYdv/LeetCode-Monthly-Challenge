class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
          String[] key = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       
         Set<String> set = new HashSet<>();
        
        for(int i=0 ;i<words.length ;i++){
            String temp="";
            for(int j=0 ;j<words[i].length();j++){
                temp+= key[ words[i].charAt(j)-'a'];
            }
            set.add(temp);
            
        }


        return set.size();
    }
}
