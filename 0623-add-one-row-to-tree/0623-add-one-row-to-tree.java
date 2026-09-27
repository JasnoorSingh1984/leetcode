class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }

        doing(root,val,depth,1);
        return root;
    }

    public void doing(TreeNode root,int val,int depth,int i){
        if (root==null) return;

        if (i==depth-1){
            TreeNode left=new TreeNode (val);
            TreeNode temp=root.left;
            root.left=left;
            left.left=temp;

            TreeNode right=new TreeNode(val);
            TreeNode temp2=root.right;
            root.right=right;
            right.right=temp2;

            return;
        }

        doing(root.left,val,depth,i+1);
        doing(root.right,val,depth,i+1);
    }

}