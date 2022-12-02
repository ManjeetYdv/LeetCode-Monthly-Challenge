class Solution {
    public boolean closeStrings(String word1, String word2) {

        if(word1.length()!=word2.length()) return false; 
        int[] chars1 = new int[26];
        int [] chars2 = new int[26];

        for(char ch :  word1.toCharArray())  chars1[ch-'a']++;
        for(char ch :  word2.toCharArray()) chars2[ch-'a']++;

        //Steps-1 Checking whether same characters are used to make the strings
        for(int i=0 ;i<26 ;i++)
            if((chars1[i]!=0 && chars2[i]==0) || (chars1[i]==0 && chars2[i]!=0)) return false;

        //Step-2 Checking whether frequency of frequencies are same or frequency of char from word1 matches with frequency of some char from word2
        
        //Method-1
//        HashMap<Integer ,Integer>map = new HashMap<>();
//
//        for(int i : chars1) {
//           if(i>0) map.put(i, map.getOrDefault(i  ,0) +1);
//        }
//
//        for(int i : chars2){
//            if(i>0) {
//                if(!map.containsKey(i)) return false;
//                map.put(i , map.get(i)-1);
//                if(map.get(i)==0) map.remove(i);
//            }
//        }
//
//        return map.size()==0;

        //Method-2 for step-2
        Arrays.sort(chars1);;
        Arrays.sort(chars2);
        return Arrays.equals(chars1 , chars2);


        
    }
}
