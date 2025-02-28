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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int currSum=0;
        return calculateSum(root,currSum,targetSum);
    }
    public boolean calculateSum(TreeNode root,int currSum,int target){
        
        currSum+=root.val;

        if(root.left==null && root.right==null){
            return currSum==target;
        }
        else{
            if(root.left!=null && calculateSum(root.left,currSum,target)){
                return true;
            }
            if(root.right!=null && calculateSum(root.right,currSum,target)){
                return true;
            }
        }
        return false;
    }
}