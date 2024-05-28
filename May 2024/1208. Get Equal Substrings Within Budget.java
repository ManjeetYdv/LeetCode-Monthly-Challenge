class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0;
        int j=0;
        int n=s.length();
        int cost=0;
        int res=0;
        while(j<n){
            cost+=Math.abs((int)s.charAt(j)-(int)t.charAt(j));
            while(cost>maxCost){
                cost-=Math.abs((int)s.charAt(i)-(int)t.charAt(i));
                i++;
            }
            res=Math.max(res ,j-i+1);
            j++;
        }
        return res;
    }
}
