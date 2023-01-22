class Solution {
    List<List<String>> res;
    public void helper(int index , String s , List<String> list){

        if(index==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=index ; i<s.length() ;i++){
            if(palindromeCheck(s.substring(index  , i+1))){
                list.add(s.substring(index , i+1));
                helper(i+1 , s , list);
                list.remove(list.size()-1);
            }
        }
    }

    public boolean palindromeCheck(String str){
        int start=0;
        int end = str.length()-1;
        while(start<end) {
            if(str.charAt(start++)!=str.charAt(end--)) return false;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        helper(0 ,s , new ArrayList<>());
        return res;
    }
}
