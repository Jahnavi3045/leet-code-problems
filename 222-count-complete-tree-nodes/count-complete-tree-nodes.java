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
    public int countNodes(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root,list);

        return list.size();
    }

    public void inOrder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;
        }

        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

}