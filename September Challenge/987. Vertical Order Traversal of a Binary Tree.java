/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Tuple{
    TreeNode root;
    int row;     //Vertical
    int col;     //Level

    Tuple(TreeNode root , int row , int col){
        this.root = root;
        this.row = row;
        this.col = col;

    }

}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer , TreeMap<Integer  , PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(root  ,0 ,0));

        while(!queue.isEmpty()){
            Tuple tuple = queue.poll();
            TreeNode node = tuple.root;
            int x = tuple.row;
            int y = tuple.col;

            if(!map.containsKey(x)){
                map.put(x , new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y , new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);

            if(node.left!=null){
                queue.add(new Tuple(node.left , x-1 , y+1));
            }
            if(node.right!=null){
                queue.add(new Tuple(node.right , x+1 , y+1));
            }


        }
        
        List<List<Integer>> res = new ArrayList<>();
        for(TreeMap<Integer , PriorityQueue<Integer>> xy: map.values() ){
            List<Integer> list = new ArrayList<>();

            for(PriorityQueue<Integer> pq : xy.values()){
                while(!pq.isEmpty()){
                    list.add(pq.remove());
                }
            }
            res.add(list);
        }
        
        return res;


    
   }
    
}
