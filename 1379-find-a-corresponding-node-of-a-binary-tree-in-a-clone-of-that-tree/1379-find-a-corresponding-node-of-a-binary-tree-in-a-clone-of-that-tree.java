class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode root, final TreeNode target) {
        if (root==null) return null;

        if (root.val==target.val) return root;

        TreeNode left=getTargetCopy(original,root.left,target);
        if (left!=null){
            return left;
        }

        return getTargetCopy(original,root.right,target);
    }
}