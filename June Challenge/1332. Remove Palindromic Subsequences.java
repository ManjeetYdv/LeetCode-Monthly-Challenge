class Solution {
    
    public int removePalindromeSub(String str) {
        int i=0;
        int j=str.length()-1;

        while(i<=j){
            if(str.charAt(i++)!=str.charAt(j--)) return 2;

        }
        return 1;
    }
}
