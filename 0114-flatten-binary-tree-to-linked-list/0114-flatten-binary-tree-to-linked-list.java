class Solution {
    public void flatten(TreeNode root) {
        if (root==null) return;

        TreeNode left=root.left;
        TreeNode right=root.right;

        root.left=null;
        root.right=null;

        flatten(left);
        flatten(right);
        
        root.right=left;
        TreeNode last=left;
        if (last!=null){
            while (last.right!=null) last=last.right;
            last.right=right;
        }else{
            root.right=right;
        }
    }
}