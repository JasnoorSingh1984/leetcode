class Solution {
    public int maxDepth(TreeNode root) {
        return level(root);
    }

    public int level(TreeNode root){
        if (root==null){
            return 0;
        }

        return 1 + Math.max(level(root.left),level(root.right));
    }
}