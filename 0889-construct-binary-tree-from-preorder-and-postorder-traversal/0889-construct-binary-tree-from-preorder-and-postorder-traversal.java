class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return con(preorder,postorder,0,preorder.length-1,0,preorder.length-1);
    }

    public TreeNode con(int[] preorder,int[] postorder,int pre,int rend,int post,int oend){
        if (pre>rend) return null;

        TreeNode root=new TreeNode(preorder[pre]);
        if (pre == rend) return root;
        int next=preorder[pre+1];
        int j=0;
        for (int i=0;i<postorder.length;i++){
            if (postorder[i]==next){
                j=i;
                break;
            }
        }

        int num=j-post+1;

        root.left=con(preorder,postorder,pre+1,pre+num,post,j);
        root.right=con(preorder,postorder,pre+num+1,rend,j+1,oend-1);

        return root;

    }
}