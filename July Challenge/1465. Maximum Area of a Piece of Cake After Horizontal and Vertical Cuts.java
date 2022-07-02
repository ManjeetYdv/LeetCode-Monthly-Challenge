class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long maxH=h-horizontalCuts[horizontalCuts.length-1];
        long maxW=w-verticalCuts[verticalCuts.length-1];
        long mod = (long)1e9+7;

        for(int i=0 ;i<horizontalCuts.length;i++){

            if(i==0){
                maxH = Math.max(horizontalCuts[i], maxH );
            }
            else{
                maxH=Math.max(horizontalCuts[i]-horizontalCuts[i-1]  , maxH);
            }



        }

        for(int i=0 ;i<verticalCuts.length ;i++){

            if(i==0){
                maxW =Math.max(verticalCuts[0] , maxW);
            }
            else{
                maxW=Math.max(verticalCuts[i]-verticalCuts[i-1] , maxW);
            }

        }

        
        return (int)((maxW*maxH)%mod);
    }
}
