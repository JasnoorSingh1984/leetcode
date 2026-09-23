class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=postorder.length;
        return build(postorder,inorder,0,n-1,0,n-1);
    }

    public TreeNode build(int[] postorder,int[] inorder,int plow,int phigh,int ilow,int ihigh){
        if(plow>phigh) return null;

        int val=postorder[phigh];
        TreeNode root=new TreeNode(val);

        int r=-1;
        for (int i=ilow;i<=ihigh;i++){
            if (inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt=r-ilow;

        root.left=build(postorder,inorder,plow,plow+cnt-1,ilow,r-1);
        root.right=build(postorder,inorder,plow+cnt,phigh-1,r+1,ihigh);

        return root;
    }
}