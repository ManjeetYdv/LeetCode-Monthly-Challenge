class Solution {
    private static boolean isVowel(char ch){
        return ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
    public String reverseVowels(String s) {
       
        int left =0;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        
        while(left<right){
            
            boolean leftVowel = false;
            boolean rightVowel= false;
            
            while(!leftVowel && left<right){
               if(!isVowel(s.charAt(left))) left++;
               else leftVowel = true;
            }
            while(!rightVowel && left<right){
                if(!isVowel(s.charAt(right))) right--;
                else rightVowel = true;
            }
            
            sb.setCharAt(left , s.charAt(right));
            sb.setCharAt(right , s.charAt(left));
            right--;
            left++;
        }
        
        return sb.toString();
        
    }
}
