class Solution {
    public boolean isBalanced(TreeNode root){
        return check(root)!=-1;
    }

    public int check(TreeNode root) {
        if (root==null){
            return 0;
        }

        int ls=check(root.left);
        if (ls==-1){
            return -1;
        }

        int rs=check(root.right);
        if (rs==-1){
            return -1;
        }

        if (Math.abs(ls-rs)>1){
            return -1;
        }

        return 1+Math.max(ls,rs);

    }
}