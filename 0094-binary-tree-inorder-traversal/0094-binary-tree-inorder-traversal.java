class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        check(root,arr);

        return arr;
    }

    public void check(TreeNode root,List<Integer> arr){
        if (root==null){
            return ;
        }

        check(root.left,arr);
        arr.add(root.val);
        check(root.right,arr);
    }
}