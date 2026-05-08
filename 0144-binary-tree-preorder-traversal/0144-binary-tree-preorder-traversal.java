class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        order(root,arr);
        return arr;
    }

    public void order(TreeNode root,List<Integer> arr){
        if (root==null){
            return;
        }

        arr.add(root.val);
        order(root.left,arr);
        order(root.right,arr);
    }
}