class Solution {
    public String minWindow(String s, String t) {
        
        int[] freq = new int[128];
        for(char c : t.toCharArray()) freq[c]++;

        int start=0 , end=0 , minStart=0 , minLen = Integer.MAX_VALUE  , counter = t.length();

        while(end<s.length()){
            char curr = s.charAt(end);
            if(freq[curr]>0) counter--;
            freq[curr]--;
            end++;

            while(counter==0){
                if(minLen>end-start){
                    minLen = end-start;
                    minStart = start;
                }

                freq[s.charAt(start)]++;
                if(freq[s.charAt(start)]>0) counter++;
                start++;
            }

        }
        
        return minLen==Integer.MAX_VALUE? "" : s.substring(minStart , minStart+minLen);

    }
}
