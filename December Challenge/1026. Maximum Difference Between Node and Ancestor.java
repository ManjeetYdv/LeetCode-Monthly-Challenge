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
   
    int res = Integer.MIN_VALUE;

     public void helper(TreeNode root  , int maxAmongAncestor , int minAmongAncestor ){
        if(root==null) return;
        res = Integer.max(res  , Integer.max(Math.abs(minAmongAncestor-root.val) , Math.abs(maxAmongAncestor-root.val)));
        
        int newMax = Integer.max(root.val , maxAmongAncestor);
        int newMin = Integer.min(root.val , minAmongAncestor);
        
        helper(root.left , newMax , newMin);
        helper(root.right , newMax , newMin);


     }
    public int maxAncestorDiff(TreeNode root) {

        helper(root , root.val , root.val);
        return res;
    }
    
   //Brute Force
    // int res = Integer.MIN_VALUE;
    // public int maxAncestorDiff(TreeNode root) {
    //     List<Integer> list = new ArrayList<>();
    //     helper(root , list);
    //     return res;
    // }

    //  private void helper(TreeNode root , List<Integer> list ){
        
    //      if(root==null) return;
    //      if(list.size()!=0) res = Integer.max(res , getMaxDiff(list , root.val));
    //      list.add(root.val);
    //      helper(root.left , list);
    //      helper(root.right , list);
    //      list.remove(list.size()-1);
    //  }
    

    // private int getMaxDiff(List<Integer>list , int currVal){
         
    //      int maxD = Integer.MIN_VALUE;
    //      for(int i : list) maxD = Integer.max(maxD , Math.abs(i-currVal));
    //      return maxD;
       
    //  }
}
