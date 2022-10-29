class Solution {

    private class Plant{
        int plantTime;
        int growTime;

       public Plant(int plantTime , int growTime){
            this.plantTime = plantTime;
            this.growTime = growTime;
        }
    }
    public int earliestFullBloom(int[] plantTime, int[] growTime) {

        List<Plant> list = new ArrayList<>();

        for(int i =0 ;i<plantTime.length ;i++){
           list.add(new Plant(plantTime[i] , growTime[i]));
        }

        //sorting in decending order of growtime
        //The seed to bloom last dominates the final answer. Exchanging the planting of this seed with another seed with  a larger will result in a potentially worse answer.
        Collections.sort(list , (Plant a , Plant b)->b.growTime-a.growTime);

        int time=0;
        int max=0;

        for(int i=0 ;i<plantTime.length ;i++){
            time+=list.get(i).plantTime;
            max = Math.max(max , time+list.get(i).growTime);
        }

        return max;

    }
}
