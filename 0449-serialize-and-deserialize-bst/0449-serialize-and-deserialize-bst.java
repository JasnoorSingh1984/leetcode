public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        inorder(root,sb);
        return sb.toString();
    }

    public void inorder(TreeNode root,StringBuilder sb){
        if (root==null){
            sb.append("n,");
            return;
        }

        sb.append(root.val + ",");
        inorder(root.left,sb);
        inorder(root.right,sb);
    }

    int idx;
    public TreeNode deserialize(String data) {
        idx=0;
        String[] arr=data.trim().split(",");
        return build(arr);
    }

    public TreeNode build(String[] arr){
        if (idx>=arr.length) return null;

        String val=arr[idx++];

        if (val.equals("n")) return null;

        TreeNode root=new TreeNode(Integer.parseInt(val));
        root.left=build(arr);
        root.right=build(arr);

        return root;
    }
}
