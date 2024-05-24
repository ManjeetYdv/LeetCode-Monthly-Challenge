class Solution {
    public int helper2(int i , String []words , int []freqLetter ,int[]score){
       if(i==words.length){
           return 0;
       }

       int pick=0;
       int skip=0;
       //pick if possible
        int wordScore=0;
        boolean possible=true;
       int[]temp = Arrays.copyOf(freqLetter ,freqLetter.length);
        for(char ch : words[i].toCharArray()){
            if(freqLetter[ch-'a']>0) {
                freqLetter[ch-'a']--;
                wordScore+=score[ch-'a'];
            }
            else{
                possible=false;
                break;
            }
        }
        if(possible) pick = wordScore+ helper2(i+1 ,words ,freqLetter ,score );
        for(int k=0;k<26;k++) freqLetter[k]=temp[k];
        //not pick
        skip=helper2(i+1 ,words ,freqLetter , score);

        return Math.max(pick , skip);
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[]freqLetter = new int[26];
        for(char ch : letters) freqLetter[ch-'a']++;
        return helper2(0, words ,freqLetter , score );
    }
}
