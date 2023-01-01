class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String ,  Character> map = new HashMap<>();
        HashMap<Character , String> map2 = new HashMap<>();
        
        String[] words =s.split("\\s+");
        if(words.length!=pattern.length()) return false;

        for(int i=0 ;i<words.length ;i++){
             if(!map.containsKey(words[i]) && !map2.containsKey(pattern.charAt(i))) {
                map.put(words[i] , pattern.charAt(i));
                map2.put(pattern.charAt(i) , words[i]);
            }
            else if(map.containsKey(words[i]) && !map.get(words[i]).equals(pattern.charAt(i))) return false;
            else if(map2.containsKey(pattern.charAt(i)) && !map2.get(pattern.charAt(i)).equals(words[i])) return false;
           
        }
        return true;
    }
    
}
