class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }

    public boolean check(TreeNode l,TreeNode s){
        if (l==null && s==null){
            return true;
        }

        if (l==null || s==null){
            return false;
        }

        if (l.val!=s.val){
            return false;
        }

        return check(l.left,s.right) && check(l.right,s.left);
    }
}