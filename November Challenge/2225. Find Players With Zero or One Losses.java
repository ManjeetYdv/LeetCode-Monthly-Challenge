class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int []arr : matches){
            if(!map.containsKey(arr[0])) map.put(arr[0] , 0); 
            map.put(arr[1] , map.getOrDefault(arr[1],  0)+1);
        }
        
        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss =  new ArrayList<>();
        
        for(int key : map.keySet()){
            if(map.get(key)==0) zeroLoss.add(key);
            if(map.get(key)==1) oneLoss.add(key);
        }
        List<List<Integer>> res = new ArrayList<>();
        zeroLoss.sort((a, b)->a-b);
        oneLoss.sort((a , b)->a-b);
        res.add(zeroLoss);
        res.add(oneLoss);
        return res;
        
    }
}
