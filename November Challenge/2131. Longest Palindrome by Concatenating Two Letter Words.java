class Solution {
    public int longestPalindrome(String[] words) {
        
        
        HashMap<String , Integer> map = new HashMap<>();
        for(String word: words) map.put(word , map.getOrDefault(word , 0)+1);

     
        int res=0;

        for(String str : words){

                if(map.get(str)==0) continue;
                String reverse=  ""+str.charAt(1)+str.charAt(0);
                if(str.equals(reverse)) continue; //cases like "aa" are handled later below
                if(map.containsKey(reverse)){
                    int x = Math.min(map.get(str) , map.get(reverse));
                    res+= (x*4);

                    map.put(str , 0); //no longer needed
                    map.put(reverse , 0);

                }
                else map.put(str , 0); //String is neither a palindrome itself neither has a mirror string...we dont need it so put 0
        }


        //to handle cases like "aa" "gg"
        boolean middle=false; // We can also use exactly one in the middle to form an even longer palindrome.
        for(String str : words){
            if(map.get(str)==0) continue;
            String reverse = ""+str.charAt(1)+str.charAt(0);
            
            if(str.equals(reverse)){
                
                if(map.get(str)%2==0){
                    res+=(map.get(str)*2);
                }
                else if(map.get(str)%2!=0 && !middle){
                    res+=(map.get(str)*2);
                    middle = true;
                }
                else res+= (map.get(str)-1)*2;
                map.put(str , 0);  
                
                
            }


        }
        
        return res;
    }
}
