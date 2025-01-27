package Trees;
import java.util.ArrayList;

class BSTInOrderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversalRec(root, list);
        return list;
    }

    private static ArrayList<Integer> inorderTraversalRec(TreeNode node, ArrayList<Integer> list){
        if(node != null){
            inorderTraversalRec(node.left, list);
            list.add(node.val);
            inorderTraversalRec(node.right, list);
        }

        return list;
    }
}