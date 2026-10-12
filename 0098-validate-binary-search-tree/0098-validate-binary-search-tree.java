class Solution {
    public boolean isValidBST(TreeNode root) {
        return find(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean find(TreeNode root,long min,long max){
        if (root==null) return true;

        if (root.val<=min || root.val>=max) return false;

        return find(root.left,min,root.val) && find(root.right,root.val,max);
    }
}