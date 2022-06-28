class Solution {
    public int minDeletions(String s) {
        
        int [] freq = new int[26];
        for(int i=0 ;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        Set<Integer> set = new HashSet<>();
        
        int deletions=0;
        for(int count : freq){
            
            while(count>0 && set.contains(count)){
                count--;
                deletions++;
            }
            
            if(count>=1){
            set.add(count);
            }
        }
        
        return deletions;

    }
}
