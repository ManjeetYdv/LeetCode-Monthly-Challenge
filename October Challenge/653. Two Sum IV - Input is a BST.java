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

    public void inOrder(TreeNode root  , List<Integer> list){

        if(root==null) return;
        inOrder(root.left , list);
        list.add(root.val);
        inOrder(root.right , list);
    }
    public boolean findTarget(TreeNode root, int k) {

         
        List<Integer> list = new ArrayList<>();
        inOrder(root , list);   //inorder of bst will be sorted itself
        
        int front = 0;
        int back = list.size()-1;
        
        while(front<back){
            int sum = list.get(front)+list.get(back);
            if(sum==k) return true;
            if(sum<k) front++;
            if(sum>k) back--;
        }
        
        return false;
    }
}
