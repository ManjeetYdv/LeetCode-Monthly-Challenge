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

    private boolean helper(TreeNode root , int curSum , int target){
        
        if(root==null) return false;

        curSum+=root.val;

        if(root.left==null && root.right==null) {
            if(curSum==target) return true;
            else return false;
        }

        if(helper(root.left , curSum ,target)) return true;
        if(helper(root.right , curSum , target)) return true;
        return false;


    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return helper(root , 0 , targetSum);
    }
}
