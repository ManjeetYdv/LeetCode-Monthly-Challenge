class Solution {
    public int minPartitions(String str) {
        
        int maxP =0;
        for(int i= 0 ;i<str.length();i++){
            
            maxP = Integer.max(maxP , str.charAt(i)-'0');
        }
        return maxP;
        
    }
}
