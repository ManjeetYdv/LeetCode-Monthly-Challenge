class Solution {

     public boolean hasUnique(String s){
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(!set.add(ch)) return false;
        }
        return true;
    }

    public int helper(List<String> arr , String s ,int index , HashMap<String, Integer> map){

        if(index==arr.size()){
            if(hasUnique(s)) return s.length();
            return 0;
        }
        if(map.containsKey(s)) return map.get(s);
        
        int x = 0;
        //add
        if(hasUnique(s+arr.get(index))) {
            x=helper(arr , s+arr.get(index) , index+1 , map);
        }
        //not add
        x= Math.max(x , helper(arr , s , index+1, map));
        
        map.put(s , x);
        return x;

    }
    public int maxLength(List<String> arr) {

        HashMap<String ,Integer> map = new HashMap<>();
        
        helper(arr , "" , 0 , map);
        return map.get("");
    }
}
