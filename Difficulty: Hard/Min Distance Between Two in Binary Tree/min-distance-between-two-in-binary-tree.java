class Solution {
    public int findDist(Node root, int a, int b) {
        Node lca=LCA(root,a,b);
        
        int[] ans={0,0};
        answer(lca,a,b,0,ans);
        
        return ans[0]+ans[1];
    }
    
    public void answer(Node root,int a,int b,int level,int[] ans){
        if (root==null){
            return;
        }
        
        if (root.data==a){
            ans[0]=level;
        }
        if (root.data==b){
            ans[1]=level;
        }
        
        answer(root.left,a,b,level+1,ans);
        answer(root.right,a,b,level+1,ans);
    }
    
    public Node LCA(Node root,int a,int b){
        if (root==null || root.data==a || root.data==b){
            return root;
        }
        
        Node left=LCA(root.left,a,b);
        Node right=LCA(root.right,a,b);
        
        if (left!=null && right!=null){
            return root;
        }
        
        if (left!=null){
            return left;
        }else{
            return right;
        }
    }
}