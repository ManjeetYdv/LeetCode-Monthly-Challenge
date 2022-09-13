class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
       
        Arrays.sort(tokens);
        if(tokens.length==0) return 0;
        
        int score=0;
        int maxScore =0;
        int left = 0;
        int right = tokens.length-1;

        while(left<=right){
            
            //logic is whenever you use power to increase score use least token possible
            //and whenever you want to use score to increase power use max token possible

            if(power>=tokens[left]){
                score++;
                power-=tokens[left++];
           
            }
           else if(power<tokens[left] && score>=1){
                score--;
                power+=tokens[right--];
                

            }
            else break;
            
            maxScore = Math.max(maxScore , score);
        }

        return maxScore;

    }
}
