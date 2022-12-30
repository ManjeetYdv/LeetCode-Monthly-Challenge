class Solution {
    List<List<Integer>> res;

    public void helper(int index, int[][]graphs , List<Integer> list){
        if(index==graphs.length-1) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0 ;i<graphs[index].length;i++){
            list.add(graphs[index][i]);
            helper(graphs[index][i]  , graphs , list);
            list.remove(list.size()-1);
        }
        
        return;
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        helper(0 , graph , list );
        return res;
    }
}
