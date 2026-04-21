class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        order(arr,root);
        return arr;
    }

    public void order(List<Integer> arr,TreeNode root){
        if (root==null){
            return;
        }

        order(arr,root.left);
        arr.add(root.val);
        order(arr,root.right);
    }
}