class Solution {
    int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return check(preorder,inorder,0,inorder.length-1);
    }

    public TreeNode check(int[] preorder,int[] inorder,int start,int end){
        if (start>end){
            return null;
        }

        TreeNode root=new TreeNode(preorder[idx++]);

        int pos=0;
        while (inorder[pos]!=root.val){
            pos++;
        }

        root.left=check(preorder,inorder,start,pos-1);
        root.right=check(preorder,inorder,pos+1,end);

        return root;
    }
}