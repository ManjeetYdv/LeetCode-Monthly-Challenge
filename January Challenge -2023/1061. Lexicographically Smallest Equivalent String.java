class Solution {
    //   public String smallestEquivalentString(String s1, String s2, String baseStr) {
    //     int[] union = new int[26];
    //     for(int i=0 ; i<26 ;i++){
    //         union[i]=i;
    //     }
    //     int l =s1.length();
        
    //     for(int i=0 ;i<l ;i++){
    //         int a = findParent(union , s1.charAt(i)-'a');
    //         int b = findParent(union , s2.charAt(i)-'a');
            
    //         if(a<b){
    //             union[s1.charAt(i)-'a'] =a;
    //             union[s2.charAt(i)-'a'] =a;
    //         }
    //         else {
    //             union[s1.charAt(i)-'a'] =b;
    //             union[s2.charAt(i)-'a'] =b;
    //         }
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     for(char ch : baseStr.toCharArray()){
    //         sb.append((char)(union[ch-'a']+'a'));
    //     }
        
    //     return sb.toString();
    // }
    
    // public int findParent(int[]union , int i){
    //     if(union[i]==i) return i;
    //     return findParent(union , union[i]);
        
    // }
    private int[] p;

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        p = new int[26];
        for (int i = 0; i < 26; ++i) {
            p[i] = i;
        }
        for (int i = 0; i < s1.length(); ++i) {
            int a = s1.charAt(i) - 'a', b = s2.charAt(i) - 'a';
            int pa = find(a), pb = find(b);
            if (pa < pb) {
                p[pb] = pa;
            } else {
                p[pa] = pb;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char a : baseStr.toCharArray()) {
            char b = (char) (find(a - 'a') + 'a');
            sb.append(b);
        }
        return sb.toString();
    }

    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }
}
