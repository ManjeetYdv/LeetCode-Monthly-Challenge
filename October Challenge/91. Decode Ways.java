// Recurssive Solution(TLE):
class Solution {

    int ways=0;
    private void helper(String s , int index , HashMap<String , Integer> map){
       
        if(index==s.length()){
            ways++;
            return;
        }

        //taking 1 digits
        String oneAtOnce = s.substring(index ,index+1);
        if(map.containsKey(oneAtOnce)) helper(s , index+1 , map);
        else return;

        //taking 2 digits

        if(index+2<s.length()+1){
            String twoAtOnce = s.substring(index , index+2);
            if(map.containsKey(twoAtOnce)) helper(s,  index+2, map);
            else return;
        }
        else return;


    }
    public int numDecodings(String s) {

        HashMap<String , Integer> map = new HashMap<>();
        for(int i=1 ;i<=26; i++){
            map.put(Integer.toString(i) ,1);
        }
        helper(s , 0 , map);
        
        return ways;
    }
}

// Optimised Dynamic approach

class Solution {

    private int helper(String s , int index , HashMap<String , Integer> map, int[]dp){
       
       
        if(index==s.length()){
            return 1;
        }
        if(dp[index]!=-1) return dp[index];

        int i=0;
        int j=0;
        //taking 1 digits
        String oneAtOnce = s.substring(index ,index+1);
        if(map.containsKey(oneAtOnce)) {
          i= helper(s , index+1 , map , dp);
        }


        //taking 2 digits

        if(index+2<s.length()+1){
            String twoAtOnce = s.substring(index , index+2);
            if(map.containsKey(twoAtOnce)) {
               j= helper(s,  index+2, map , dp);
            }
        }

        return dp[index]=i+j;



    }
    public int numDecodings(String s) {

        int[]dp = new int[s.length()];
        Arrays.fill(dp , -1);
        
        HashMap<String , Integer> map = new HashMap<>();
        for(int i=1 ;i<=26; i++){
            map.put(Integer.toString(i) ,1);
        }
        return helper(s , 0 , map , dp);     
    }
}
