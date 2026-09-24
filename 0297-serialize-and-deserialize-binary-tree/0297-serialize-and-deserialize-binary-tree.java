public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        ser(root,sb);
        return sb.toString();
    }

    public void ser(TreeNode root,StringBuilder sb){
        if (root==null){
            sb.append("null,");
            return;
        }

        sb.append(root.val);
        sb.append(",");

        ser(root.left,sb);
        ser(root
        .right,sb);
    }

    public TreeNode deserialize(String data) {
        String[] str=data.trim().split(",");
        int[] arr=new int[1];

        return des(str,arr);
    }

    public TreeNode des(String[] str,int[] arr){
        if (str[arr[0]].equals("null")){
            arr[0]++;
            return null;
        }

        TreeNode root=new TreeNode(Integer.parseInt(str[arr[0]]));
        arr[0]++;

        root.left=des(str,arr);
        root.right=des(str,arr);

        return root;
    }
}