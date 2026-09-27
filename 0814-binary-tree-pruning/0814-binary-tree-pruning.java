class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root==null) return root;

        if (!present(root.left)) root.left=null;
        if (!present(root.right)) root.right=null;

        pruneTree(root.left);
        pruneTree(root.right);

        if (root.left==null && root.right==null && root.val==0){
            return null;
        }

        return root;
    }

    public boolean present(TreeNode root){
        if (root==null) return false;

        if (root.val==1) return true;

        return present(root.left) || present(root.right);
    }
}