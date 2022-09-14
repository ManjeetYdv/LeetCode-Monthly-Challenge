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
    
   int count=0;
    
   public void helper(TreeNode root , int[] freq){
       
        if(root==null) return;

        freq[root.val] = freq[root.val]+1;
        if(root.left==null && root.right==null){
            if(checkPalindrome(freq)) count++;
        }
        
        helper(root.left , freq);
        helper(root.right , freq);
        
        freq[root.val] = freq[root.val]-1; //backtracking
   }
    
     public int pseudoPalindromicPaths (TreeNode root) {
        if(root==null) return 0;
        int[] freq = new int[10];

        helper(root , freq);
        return count;
    }


    public boolean checkPalindrome(int[] freq){

        int miss =0;
        for(int i=0 ;i<=9 ;i++){
            if(freq[i]%2!=0) miss++;
            if(miss>1) return false;
        }
        return true;

    }


}
