class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        order(root,arr);
        return arr;
    }

    public void order(TreeNode root,List<Integer> arr){
        if (root==null){
            return;
        }

        order(root.left,arr);
        arr.add(root.val);
        order(root.right,arr);
    }
}