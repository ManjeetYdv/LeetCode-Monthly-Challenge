class Solution {
    public String breakPalindrome(String palindrome) {
         if(palindrome.length()==1) return "";

        for(int i=0 ;i<palindrome.length()/2 ;i++){
            if(palindrome.charAt(i)!='a') return new StringBuilder(palindrome).replace(i , i+1 , "a").toString();
        }
        return new StringBuilder(palindrome).replace(palindrome.length()-1 , palindrome.length(), "b").toString();
    }
}
