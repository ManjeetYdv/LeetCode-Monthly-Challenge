class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<int[]> heights = new ArrayList<>();

        createHeightList(buildings , heights);
        heights.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.offer(0);
        int preMax =0;

        for(int[] height : heights){
            if(height[1]<0){
                pq.offer(-height[1]);       //for-(-) = + 
            }
            else pq.remove(height[1]);

            int curMax = pq.peek();
            if(curMax!=preMax){
                List<Integer> subRes= Arrays.asList(height[0] , curMax);
                res.add(subRes);
                preMax = curMax;
            }

        }

        return res;
        
    }


    private void createHeightList(int[][] buildings, List<int[]>heights) {

        for (int[] building : buildings) {
            heights.add(new int[]{building[0], -building[2]});  //- height for starting of building
            heights.add(new int[]{building[1] , building[2]});  // + height for ending of building
        }

    }

}
