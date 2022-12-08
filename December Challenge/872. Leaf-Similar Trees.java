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
     public void dfs(TreeNode root , ArrayList<Integer> arrayList){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arrayList.add(root.val);
            return;
        }
        dfs(root.left , arrayList);
        dfs(root.right , arrayList);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leafSeq1 = new ArrayList<>();
        ArrayList<Integer> leafSeq2 = new ArrayList<>();
        dfs(root1 , leafSeq1);
        dfs(root2 , leafSeq2);
        return leafSeq1.equals(leafSeq2);
    }
}
