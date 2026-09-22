class Solution {
    Node lca(Node root, int p, int q) {
        if (root==null || root.data==p || root.data==q){
            return root;
        }
        
        Node left=lca(root.left,p,q);
        Node right=lca(root.right,p,q);
        
        if (left!=null && right!=null){
            return root;
        }
        
        if (left==null){
            return right;
        }else{
            return left;
        }
    }
}