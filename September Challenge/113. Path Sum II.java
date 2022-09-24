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
    
      public void helper(TreeNode root , int currSum , List<Integer> list , List<List<Integer>> res , int target){

        if(root==null) return ;
            
        list.add(root.val);
        currSum+=root.val;

        if(root.left==null && root.right==null){
            if(currSum==target){
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return;
            }
        }
        helper(root.left , currSum,  list , res, target);
        helper(root.right ,currSum , list , res , target);
        list.remove(list.size()-1);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> res = new ArrayList<>();
        helper(root , 0 , new ArrayList<>() , res , targetSum);
        return res;
        
    }
}
