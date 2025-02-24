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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preOrder(p,q);        
    }
    public boolean preOrder(TreeNode root1,TreeNode root2){
        if((root1==null && root2==null)){
            return true;
        }
        if(root1==null ||root2==null){
            return false;
        }
        
        if(root1.val!=root2.val){
            return false;
        }
        
        

        return preOrder(root1.left,root2.left) && preOrder(root1.right,root2.right);
    }
}