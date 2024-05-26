class Solution {
   public void helper(int i , String s , HashSet<String> dict ,StringBuilder sb , List<String> ans){
        if(i==s.length()){
            String str =sb.toString();
            ans.add(str.substring(0 ,str.length()-1));
            return;
        }
        StringBuilder sbb= new StringBuilder();
        for(int idx=i;idx<s.length();idx++){
            sbb.append(s.charAt(idx));
           // System.out.println(sbb.toString());
            if(dict.contains(sbb.toString())){
              //  System.out.println("hi");
                sb.append(sbb+" ");
                helper(idx+1 , s  , dict ,sb ,ans);
                sb.setLength(sb.length()-sbb.length()-1);
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>();
        for(String str: wordDict) dict.add(str);
        List<String> ans =new ArrayList<>();
        helper(0 , s , dict , new StringBuilder() , ans);
        return ans;
    }
}
