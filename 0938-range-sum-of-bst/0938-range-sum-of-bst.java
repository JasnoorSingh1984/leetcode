class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        find(root,low,high);
        return sum;
    }

    public void find(TreeNode root,int low,int high){
        if (root==null) return;

        if (low<=root.val && root.val<=high) sum+=root.val;

        if (root.val>low) find(root.left,low,high);
        if (root.val<high) find(root.right,low,high);
    }
}