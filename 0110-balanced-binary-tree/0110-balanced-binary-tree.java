class Solution {
    boolean flag;
    public boolean isBalanced(TreeNode root) {
        flag=true;
        level(root);
        return flag;
    }

    public int level(TreeNode root){
        if (root==null){
            return 0;
        }

        int l=level(root.left);
        int r=level(root.right);

        if (Math.abs(l-r)>1){
            flag=false;
        }

        return 1+Math.max(l,r);
    }
}