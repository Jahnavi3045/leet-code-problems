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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();

                if(temp!=null){
                    level.add(temp.val);
                    q.add(temp.left);
                    q.add(temp.right);
                }
                else{
                    level.add(null);
                }
            }
            if(!isPalindrome(level)){
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome(ArrayList<Integer> list){
        int n=list.size();

        for(int i=0;i<n/2;i++){
            if(list.get(i)!=list.get(n-i-1)){
                return false;
            }
        }

        return true;
    }
}