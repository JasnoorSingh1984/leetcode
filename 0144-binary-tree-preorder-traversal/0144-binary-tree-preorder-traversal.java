class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        order(arr,root);
        return arr;
    }

    public void order(List<Integer> arr,TreeNode root){
        if (root==null){
            return;
        }

        arr.add(root.val);
        order(arr,root.left);
        order(arr,root.right);
    }
}