class Solution {
    public boolean detectCapitalUse(String word) {
        
        int capitals =0;
        for(char ch : word.toCharArray()){
            if(ch-'A'>=0 && ch-'A'<=25) capitals++;
        }
        if(capitals==0 || capitals==word.length()) return true;
        else if(capitals==1) {
            char charFirst = word.charAt(0);
            return charFirst-'A'>=0 && charFirst-'A'<=25;
        }
        return false;
    }
}
