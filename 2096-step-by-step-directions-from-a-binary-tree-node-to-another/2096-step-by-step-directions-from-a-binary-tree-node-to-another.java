class Solution {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode s=find(root,startValue);
        TreeNode d=find(root,destValue);

        TreeNode lca=LCA(root,s,d);

        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        path(lca,s,sb);
        path(lca,d,sb2);

        for (int i=0;i<sb.length();i++){
            sb2.insert(0,'U');
        }

        return sb2.toString();
    }

    public boolean path(TreeNode root,TreeNode s,StringBuilder sb){
        if (root==null) return false;

        if (root==s) return true;

        sb.append('L');
        if (path(root.left,s,sb)) return true;
        sb.deleteCharAt(sb.length()-1);

        sb.append('R');
        if (path(root.right,s,sb)) return true;
        sb.deleteCharAt(sb.length()-1);

        return false;
    }

    public TreeNode LCA(TreeNode root,TreeNode s,TreeNode d){
        if (root==null || root==s || root==d) return root;

        TreeNode left=LCA(root.left,s,d);
        TreeNode right=LCA(root.right,s,d);

        if (left!=null && right!=null) return root;
        else if (left==null) return right;
        else return left;
    }

    public TreeNode find(TreeNode root,int val){
        if (root==null) return null;

        if (root.val==val) return root;

        TreeNode left=find(root.left,val);
        if (left!=null) return left;

        return find(root.right,val);
    }
}