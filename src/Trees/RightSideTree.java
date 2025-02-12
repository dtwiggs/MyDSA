package Trees;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return res;
        }

        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode tmp = queue.poll();

                if(i == 0){
                    res.add(tmp.val);
                }
                
                if(tmp.right != null){
                    queue.add(tmp.right);
                }

                if(tmp.left != null){
                    queue.add(tmp.left);
                }                
            }
        }

        return res;
    }
}