class Solution {
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=postorder.length-1;

        return check(inorder,postorder,0,inorder.length-1);
    }

    public TreeNode check(int[] inorder,int[] postorder,int start,int end){
        if (start>end){
            return null;
        }

        TreeNode root=new TreeNode(postorder[idx--]);

        int pos=start;
        while (inorder[pos]!=root.val){
            pos++;
        }

        root.right=check(inorder,postorder,pos+1,end);
        root.left=check(inorder,postorder,start,pos-1);

        return root;
    }
}