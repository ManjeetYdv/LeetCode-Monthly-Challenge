class Solution {
    public int minDeletionSize(String[] strs) {
        
        int currColumn =0;
        int res=0;

        while(currColumn<strs[0].length()){
            char prev='0';
            for(String str : strs){
                if(prev>str.charAt(currColumn)){
                    res++;
                    break;
                }
                else prev =str.charAt(currColumn);
            }
            currColumn++;
        }
        return res;
    }
}
