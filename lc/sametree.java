import javax.swing.tree.TreeNode;

public class sametree {
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
    boolean b = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper(p,q);
        return b;
    }
    void helper(TreeNode p, TreeNode q){
        if (p == null && q == null) {return;}
        else if((p == null && q != null) || (p != null && q == null) ){
            b = false;
            return;
        }
        if(!b) return;

        helper(p.left, q.left);
        helper(p.right, q.right);
        if(p.val != q.val){
            b = false;
            return;
        }
    }
}
}
