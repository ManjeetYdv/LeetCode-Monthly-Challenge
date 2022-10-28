class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //Method 1 - using sorting to group

        // List<List<String>> res = new ArrayList<>();
        // HashMap<String ,List<String>> map = new HashMap<>();
        
        // for(String str : strs){
        //     char[] characters = str.toCharArray();
        //     Arrays.sort(characters);
        //     String curr = new String(characters);
        //     if(!map.containsKey(curr)) map.put(curr , new ArrayList<>());
        //     map.get(curr).add(str);
        // }
        
        // for(String str : map.keySet()) res.add(map.get(str));
        // return res;

        //Method 2 - using hashing to group
         
        // List<List<String>> res = new ArrayList<>();
        // HashMap<HashMap<Character ,Integer> ,List<String>> map = new HashMap<>();

        // for(String str : strs){
        //     HashMap<Character , Integer> strMap = new HashMap<>();
        //     for(char ch : str.toCharArray()) strMap.put(ch , strMap.getOrDefault(ch , 0)+1);

        //     if(!map.containsKey(strMap)) map.put(strMap , new ArrayList<>());
        //     map.get(strMap).add(str);
        // }

        // res.addAll(map.values());
        // return res;

        //Method-3 Grouping them using signature string
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            String signature = getSignature(str);
            if(!map.containsKey(signature)) map.put(signature , new ArrayList<>());
            map.get(signature).add(str);
        }

        res.addAll(map.values());
        return res;
        
    }
     private String getSignature(String str){

        int[] chars = new int[26];
        for(char ch : str.toCharArray()) chars[ch-'a']++;

        StringBuilder  sb = new StringBuilder();
        for(int i=0 ;i<26; i++) {
            if(chars[i]>0){
                sb.append(i+'a').append(chars[i]);
            }
        }
        return sb.toString();
    }
}
