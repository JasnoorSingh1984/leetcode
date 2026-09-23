class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        int n=inorder.length;
        return build(preorder,inorder,0,n-1,0,n-1);
    }
    
    public static Node build(int[] preorder,int[] inorder,int plow,int phigh,int ilow,int ihigh){
        if (plow>phigh){
            return null;
        }
        
        int val=preorder[plow];
        Node root=new Node(val);
        
        int r=-1;
        for (int i=ilow;i<=ihigh;i++){
            if (inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt=r-ilow;
        
        root.left=build(preorder,inorder,plow+1,plow+cnt,ilow,r-1);
        root.right=build(preorder,inorder,plow+cnt+1,phigh,r+1,ihigh);
        
        return root;
    }
}