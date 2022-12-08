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
    // private void inorder(TreeNode root , int low , int high){
    //     if(root==null) return;
    //     inorder(root.left , low , high);
    //     if(root.val>=low && root.val<=high) res+=root.val;
    //     inorder(root.right , low , high);
        
    // }
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
    
        if (root.val >= L && root.val <= R) return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        else if (root.val < L)  return rangeSumBST(root.right, L, R);
        else return rangeSumBST(root.left, L, R);
    }
}
