class BSTDelete {
    public TreeNode deleteNode(TreeNode root, int key) {
        deleteNodeRec(root, key);
        return root;
    }

    private TreeNode deleteNodeRec(TreeNode node, int val){
        if(node == null){
            node = null;
        } if(val < node.val){
            node.left = deleteNodeRec(node.left, val);
        } else if(val > node.val){
            node.right = deleteNodeRec(node.right, val);
        } else if(node.left == null && node.right != null){
            node = node.right;
        } else if(node.left != null && node.right == null){
            node = node.left;
        } else if(node.left == null && node.right == null){
            node = null;
        } else{
            TreeNode min = findMinNode(node.right);
            node.val = min.val;
            node.right = deleteNodeRec(node.right, min.val);
        }

        return node;
    }

    private TreeNode findMinNode(TreeNode node){
        TreeNode curr = node;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}