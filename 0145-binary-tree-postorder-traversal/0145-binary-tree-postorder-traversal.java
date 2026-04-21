class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        order(arr,root);
        return arr;
    }

    public void order(List<Integer> arr,TreeNode root){
        if(root==null){
            return;
        }

        order(arr,root.left);
        order(arr,root.right);
        arr.add(root.val);
    }
}