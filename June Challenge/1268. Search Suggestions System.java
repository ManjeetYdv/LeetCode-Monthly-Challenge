class Solution {
    List<List<String>> res;
    
     public List<String> hasPrefix (String[] words , String searchWord){

        List<String> strList = new ArrayList<>();
        int elements =0;

        for(String word : words){

            if(elements <3){

                if(word.indexOf(searchWord)==0){
                    strList.add(word);
                    elements++;
                }
            }
            else{
                break;
            }
        }
        return strList;
    }
    public List<List<String>> suggestedProducts(String[] str, String word) {
        
        Arrays.sort(str , String.CASE_INSENSITIVE_ORDER);
        res= new ArrayList<>();

        String temp ="";
        for(int i =0 ;i<word.length() ;i++){
            temp+=word.charAt(i);

            res.add(hasPrefix(str, temp));

        }
        
        return res;
        
    }
}
