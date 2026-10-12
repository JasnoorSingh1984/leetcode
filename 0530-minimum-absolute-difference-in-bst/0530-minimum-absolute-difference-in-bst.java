class Solution {
    int min;
    int prev;
    
    public int getMinimumDifference(TreeNode root) {
        min=Integer.MAX_VALUE;
        prev=-1;
        inorder(root);
        return min;
    }

    public void inorder(TreeNode root){
        if (root==null) return;

        inorder(root.left);

        if (prev!=-1) min=Math.min(min,Math.abs(prev-root.val));
        prev=root.val;

        inorder(root.right);
    }
}