class pair{
    long max;
    long min;
    pair(long ma,long mi){
        max=ma;
        min=mi;
    }
}

class Solution {
    boolean flag;
    public boolean isValidBST(TreeNode root) {
        flag=true;
        check(root);
        return flag;
    }

    public pair check(TreeNode root){
        if (root==null) return new pair(Long.MIN_VALUE,Long.MAX_VALUE);

        pair left=check(root.left);
        pair right=check(root.right);

        long max=Math.max(root.val,Math.max(left.max,right.max));
        long min=Math.min(root.val,Math.min(left.min,right.min));

        if (left.max >= root.val || right.min<=root.val) flag=false;

        return new pair(max,min);
    }
}