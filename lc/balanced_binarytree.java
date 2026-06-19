import javax.swing.tree.TreeNode;

public class balanced_binarytree {
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
class Solution{
    boolean f = true;
    public boolean isBalanced(TreeNode root) {
        check(root);
        return f;
        
    }
    int check (TreeNode root){
        if (root == null) return 0;
        if(!f) return 0;
        int left = check(root.left);
        int right = check(root.right);
        if(left-right >1 || right-left >1){
            f = false;
            return 0;
        }
        return 1 + Math.max(left,right);
    }
}
}
