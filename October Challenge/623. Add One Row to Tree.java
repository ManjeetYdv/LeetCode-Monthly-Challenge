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

     public void helper(TreeNode root , int curDepth , int depth , int val){

        if(root!=null){
        if(curDepth==depth-1){

            TreeNode left = root.left;
            TreeNode right = root.right;

            TreeNode nodeleft = new TreeNode(val);
            TreeNode noderight = new TreeNode(val);
            nodeleft.left = left;
            noderight.right = right;

            root.left = nodeleft;
            root.right = noderight;

            return;
       }
    }
    else return;  //if root==null
        
        helper(root.left , curDepth+1 , depth , val);
        helper(root.right , curDepth+1 , depth , val);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
       
       if(depth==1){
           TreeNode newRoot = new TreeNode(val);
           newRoot.left = root;
           newRoot.right = null;
           root = newRoot;
           return root;
       }
        helper(root , 1 , depth , val);
        return root;
    }
}
