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
   
    public int helper(TreeNode root  , int value){
        
        if(root==null) return 0;
        
         int left = helper(root.left , Integer.max(root.val , value));
         int right =  helper(root.right , Integer.max(root.val , value));
        
        if(root.val>=value) return 1+left+right;
        else return left+right;
        
    }
    public int goodNodes(TreeNode root) {
        
       return  helper(root , root.val);
       
        
    }
}
