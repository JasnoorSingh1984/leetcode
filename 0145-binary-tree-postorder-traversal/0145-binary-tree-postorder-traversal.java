class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        order(root,arr);
        return arr;
    }

    public void order(TreeNode root,List<Integer> arr){
        if (root==null){
            return;
        }

        order(root.left,arr);
        order(root.right,arr);
        arr.add(root.val);
    }
}