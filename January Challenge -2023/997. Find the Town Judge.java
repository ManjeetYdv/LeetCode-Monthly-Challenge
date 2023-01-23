class Solution {
    public int findJudge(int n, int[][] trust) {
       
        int[] trusted = new int[n+1];
        boolean[] trusts = new boolean[n+1];
        
        for(int []arr : trust){
            trusted[arr[1]]++;
            trusts[arr[0]] = true;
        }
        
        for(int i=1 ; i<=n ;i++){
            if(trusted[i]==n-1 && trusts[i]==false) return i;
        }
        return -1;
    }
}
