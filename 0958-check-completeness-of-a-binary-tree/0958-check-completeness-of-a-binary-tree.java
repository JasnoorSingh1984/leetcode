class Solution {
    public boolean isCompleteTree(TreeNode root) {
        int node=find(root);
        return put(root,1,node);
    }

    public boolean put(TreeNode root,int i,int node){
        if (root==null) return true;

        if (i>node) return false;

        return put(root.left,2*i,node) && put(root.right,2*i+1,node);
    }

    public int find(TreeNode root){
        if (root==null) return 0;

        return 1 + find(root.left) + find(root.right);
    }
}