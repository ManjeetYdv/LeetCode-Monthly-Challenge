class Solution {
    public int maximum69Number (int num) {
        String snum = Integer.toString(num);
        char [] chars = snum.toCharArray();

        for(int i=0 ;i<chars.length; i++){
            if(chars[i]=='6'){
                chars[i]='9';
                break;
            }
        }
        return Integer.valueOf(new String(chars));
    }
}
