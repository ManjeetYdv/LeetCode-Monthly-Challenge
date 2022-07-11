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
    
    List<Integer> res;
    public void func(TreeNode root , int level){
    
        if(root==null){
            return;
        }
        if(level==res.size()){
            res.add(root.val);
        }
        
        func(root.right , level+1);
        func(root.left , level+1);
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        
        res = new ArrayList<>();
        func(root , 0);
        return res;
        
    }
}
