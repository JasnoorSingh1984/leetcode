class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> arr=new ArrayList<>();

        HashSet<Integer> set=new HashSet<>();
        for (int val:to_delete){
            set.add(val);
        }

        root=delete(root,set,arr);

        if (root!=null){
            arr.add(root);
        }

        return arr;
    }

    public TreeNode delete(TreeNode root,HashSet<Integer> set,List<TreeNode> arr){
        if (root==null) return null;

        root.left=delete(root.left,set,arr);
        root.right=delete(root.right,set,arr);

        if (set.contains(root.val)){
            if (root.left!=null){
                arr.add(root.left);
            }
            if (root.right!=null){
                arr.add(root.right);
            }
            return null;
        }

        return root;
    }
}