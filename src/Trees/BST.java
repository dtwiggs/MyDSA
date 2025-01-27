package Trees;
class BST {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode newRoot;
        if(root == null){
            newRoot = null;
        } else if(val == root.val){
            newRoot = root;
        } else{
            newRoot = searchBSTRec(root, val);
        }
        return newRoot;
    }

    private static TreeNode searchBSTRec(TreeNode node, int val){
        TreeNode newRoot;
        if(node == null){
            newRoot = null;
        } else if(val < node.val){
            newRoot = searchBSTRec(node.left, val);
        } else if(val > node.val){
            newRoot = searchBSTRec(node.right, val);
        } else{
            newRoot = node;
        }
        return newRoot;
    }
}