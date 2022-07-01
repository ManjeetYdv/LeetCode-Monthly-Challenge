class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes , (a , b)->b[1]-a[1]);
        int maxLoad = 0;

        for(int[] i : boxTypes){

            if(i[0]<=truckSize){
               truckSize-=i[0];
               maxLoad += i[0]*i[1];
            }
            else{
                maxLoad+=truckSize*i[1];
                break;
            }
        }
        return maxLoad;
    }
}
