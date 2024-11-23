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
class BSTInsert {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
        } else if(val > root.val && root.right == null){
            root.right = new TreeNode(val);
        } else if(val < root.val && root.left == null){
            root.left = new TreeNode(val);
        } else{
            insertBSTRec(root, val);
        }
        return root;
    }

    private static TreeNode insertBSTRec(TreeNode node, int val){
        if(node == null){
            node = new TreeNode(val);
        } else if(val > node.val){
            node.right = insertBSTRec(node.right, val);
        } else{
            node.left = insertBSTRec(node.left, val);
        }
        return node;
    }
}