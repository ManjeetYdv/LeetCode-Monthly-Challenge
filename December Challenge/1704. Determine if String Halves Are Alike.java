class Solution {
     public boolean isVowel(char ch){
        return ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u' || ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    public boolean halvesAreAlike(String s) {
       
        int i=0;
        int j=s.length()/2;
        int leftVowels = 0 , rightVowels=0;
        
        while(j<s.length()){
            if(isVowel(s.charAt(i++))) leftVowels++;
            if(isVowel(s.charAt(j++))) rightVowels++;
        }
        
        return leftVowels==rightVowels;
    }
}
