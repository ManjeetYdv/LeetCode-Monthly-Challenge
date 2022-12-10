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
    long res=0;
    long mod  = (long) Math.pow(10 , 9)+7;
    public long totalSum(TreeNode root){
        if(root==null) return 0;
        return root.val + totalSum(root.left) + totalSum(root.right);

    }

    public long helper(TreeNode root , long totalSum){ //will calculate subtree sum and update res
        if(root==null) return 0;

        long subTreeSum  =root.val + helper(root.left , totalSum) + helper(root.right , totalSum);
        long restTreeSum = totalSum-subTreeSum;
        res = Math.max(res , subTreeSum*restTreeSum);
       
        return subTreeSum;


    }
    public int maxProduct(TreeNode root) {
        long totalSum = totalSum(root);
        helper(root , totalSum);
        res%=mod;
        return (int)res;


    }
}
