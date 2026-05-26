class Solution {
    public boolean isBalanced(TreeNode root) {
        return check(root)!=-1;
    }

    public int check(TreeNode root){
        if (root==null){
            return 1;
        }

        int ls=check(root.left);
        int rs=check(root.right);

        if (ls==-1 || rs==-1){
            return -1;
        }

        if (Math.abs(ls-rs)>1){
            return -1;
        }

        return 1+Math.max(ls,rs);        
    }
}