class Solution {
    public static int lcs(String s1, String s2) {
    
    int n=s1.length();
    int m=s2.length();

    int dp[][]=new int[n+1][m+1];
    for(int rows[]: dp)
    Arrays.fill(rows,-1);
    for(int i=0;i<=n;i++){
        dp[i][0] = 0;
    }
    for(int i=0;i<=m;i++){
        dp[0][i] = 0;
    }
    
    for(int ind1=1;ind1<=n;ind1++){
        for(int ind2=1;ind2<=m;ind2++){
            if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
                dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
            else
                dp[ind1][ind2] = 0 + Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
        }
    }
    
    return dp[n][m];
}
    public int minDistance(String str1, String str2) {
        
        
        //Failed due to repeatations
        
        
//        if(word1.indexOf(word2)!=-1){                /
//            return word1.length()-word2.length();
//        }
        
        
//         String temp = "";
//         int count=0;
        
//         for(int i=0 ;i<word1.length() ;i++){
            
//             if(word2.indexOf(word1.charAt(i))==-1){
//                 count++;
//             }
//             else{
//                 temp+=word1.charAt(i);
//             }
//         }
        
        
//         for(int i=0 ; i<word2.length() ;i++){
            
//             if(i+1<=temp.length()){
                
//                 if(word2.charAt(i)!=temp.charAt(i)){
//                     count++;
//                 }
//             }
//             else{
//                 count++;
//             }
//         }
        
//         return count;
                int n = str1.length();
                int m = str2.length();

                int k = lcs(str1,str2);

                return (n-k)+(m-k);

    }
}                 
        
