class Solution {
    public String tree2str(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        find(root,sb);
        return sb.toString();
    }

    public void find(TreeNode root,StringBuilder sb){
        if (root==null){
            return;
        }

        sb.append(root.val);

        if (root.left!=null){
            sb.append("(");
            find(root.left,sb);
            sb.append(")");
        }

        if (root.right!=null){
            
            if (root.left==null){
                sb.append("()");
            }

            sb.append("(");
            find(root.right,sb);
            sb.append(")");
        }
    }
}