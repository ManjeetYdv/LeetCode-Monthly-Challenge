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
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
         List<Double> res = new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int size = queue.size();
            double level_sum =0.0;
            for(int i=0 ;i<size ;i++){

                TreeNode c = queue.remove();
                level_sum+=c.val;

                if(c.left!=null) queue.add(c.left);
                if(c.right!=null) queue.add(c.right);

            }
           res.add(level_sum/size);
        }

        return res;
        
        
    }
}
