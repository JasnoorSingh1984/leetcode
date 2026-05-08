class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (check(root.left,root.right)==true){
            return true;
        }else{
            return false;
        }
    }

    public boolean check(TreeNode p,TreeNode q){
        if (p==null && q==null){
            return true;
        }
        if (p==null || q==null){
            return false;
        }

        if (p.val!=q.val){
            return false;
        }

        return check(p.left,q.right) && check(p.right,q.left);
    }
}