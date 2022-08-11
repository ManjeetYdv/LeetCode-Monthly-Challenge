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
    
    public boolean valid(TreeNode root , long low_range , long high_range){
        
        if(root==null) return true;
        
        if(root.val>=high_range || root.val<=low_range) return false;
        
        if(valid(root.left , low_range , root.val) && valid(root.right , root.val , high_range)){
            return true;
        }
        else return false;
    }
    
    public boolean isValidBST(TreeNode root) {
          
        return valid(root , Long.MIN_VALUE , Long.MAX_VALUE);
       
    }
}
