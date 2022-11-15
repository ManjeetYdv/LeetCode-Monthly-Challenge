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
    // int res=0;
    // public void helper(TreeNode root){
    //     if(root==null) return;
    //     res++;
    //     helper(root.left);
    //     helper(root.right);
    //     }
    
    // public int countNodes(TreeNode root) {
    //     helper(root);
    //     return res;
    // }
     
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int rh = getRightHeight(root);
        int lh = getLeftHeight(root);

        if(rh==lh) return (int)Math.pow(2 , lh)-1;
        return 1+ countNodes(root.left) + countNodes(root.right);
    }

    public int getRightHeight(TreeNode root){
        int rh=0;
        while(root!=null){
            rh++;
            root = root.right;
        }
        return rh;
    }
    public int getLeftHeight(TreeNode root){
        int lh = 0;
        while(root!=null){
            lh++;
            root = root.left;
        }
        return lh;
    }
}
