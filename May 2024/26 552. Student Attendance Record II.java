class Solution {
    public int checkRecord(int n) {
        int[][]prev =new int[2][3];
        for(int absent=0;absent<2;absent++){
            for(int last2=0 ;last2<3;last2++){
                prev[absent][last2]=1;
            }
        }
        int mod=(int)1e9+7;
        for(int i=1;i<=n ;i++){
            int [][]curr = new int[2][3];
            for(int absent=0;absent<2;absent++){
                for(int last2=0 ;last2<3;last2++){
                    int abs=0;
                    int pre=0;
                    int late=0;
                    pre = prev[absent][0];
                    if(absent==0) abs= prev[absent+1][0];
                    if(last2<2) late = prev[absent][last2+1];
                    curr[absent][last2] = ((abs+pre)%mod + late)%mod;
                }
            }
            prev=curr;
        }
        return prev[0][0];
    }
}
