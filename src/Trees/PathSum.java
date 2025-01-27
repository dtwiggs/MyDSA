package Trees;
class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean test;
        if(root == null){
            test = false;
        } else{
            test = hasPathSumRec(root, targetSum, 0);
        }
        return test;
    }

    private static boolean hasPathSumRec(TreeNode node, int target, int curr) {
        boolean test = false;
        if (node == null){
        } else if(node.left == null && node.right == null){
            curr += node.val;
            if(curr == target){
                test = true;
            } else{
                curr -= node.val;
                test = false;
            }
        } else{
            curr += node.val;
            if(hasPathSumRec(node.left, target, curr)){
                test = true;
                return test;
            }
            if(hasPathSumRec(node.right, target, curr)){
                test = true;
                return test;
            }
            curr -= node.val;
        }
        return test;
    }
}