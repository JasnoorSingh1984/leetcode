class Solution {
    int ans;
    int k2;
    public int kthSmallest(TreeNode root, int k) {
        ans=-1;
        k2=k;
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode root){
        if (root==null) return ;

        inorder(root.left);
        k2--;
        if (k2==0) ans=root.val;
        inorder(root.right);
    }
}