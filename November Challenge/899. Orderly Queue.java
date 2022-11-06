class Solution {
   
     public String orderlyQueue(String s, int k) {
       
        if(k>1){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            return new String(charArr);
        }
        
        String res=s;
        for(int i=1 ;i<s.length() ;i++){   //for i<S.length becoz after this string will be back to original after 1 complete rotation
            // String temp = s.substring(1)+s.substring(0 , 1);
            // s = temp;
            String temp = s.substring(i)+s.substring(0 , i); // same function as above but better
            if(temp.compareTo(res)<0) res = temp;
        }
        return res;
    }
}
