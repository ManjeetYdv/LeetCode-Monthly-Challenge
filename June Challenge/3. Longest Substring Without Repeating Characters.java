class Solution {
    public int lengthOfLongestSubstring(String str) {
         
        
//         if(str.length()==0){
//             return 0;
//         }
//         int maxL=1;

//         for(int i= 0;i<str.length(); i++){
//             int l=1;
//             String temp= "";
//             temp+=str.charAt(i);

//             for(int j=i+1 ;j<str.length() ;j++){

//                 if(temp.indexOf(str.charAt(j))==-1){
//                     l+=1;
//                     temp+=str.charAt(j);
//                     maxL = Integer.max(l , maxL);
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         return maxL;
        
         HashMap<Character , Integer> map = new HashMap<>();

        int left=0;
        int right=0;
        int len= 0;

        while(right<str.length()){

            if(map.containsKey(str.charAt(right))){
                left = Integer.max(left , map.get(str.charAt(right))+1);

            }
            map.put(str.charAt(right) , right);
            len = Math.max(len , right-left+1);
            right++;
        }
        return len;
    }
}
