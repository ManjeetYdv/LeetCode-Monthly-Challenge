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
    
     int not_needed = 0;
     int no_camera =-1;
     int has_camera =1;
     int ans=0;
    
    
     int minCameraCover(TreeNode root) {
        
        return dfs(root)==no_camera ? ans+=1 : ans;
    }
    
     int dfs(TreeNode root){
        
        if(root==null) return not_needed;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        if(left==no_camera || right==no_camera){
            ans++;
            return has_camera;
        }
        
        else if(left==has_camera || right==has_camera)
        {
            return not_needed; 
        }
        
        else{
           return  no_camera;
        }
    
    }
}
