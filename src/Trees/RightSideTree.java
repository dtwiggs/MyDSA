package Trees;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root != null){
            res.add(root.val);
        }

        while(root.right != null){
            root = root.right;
            res.add(root.val);
        }
        
        return res;
    }
}