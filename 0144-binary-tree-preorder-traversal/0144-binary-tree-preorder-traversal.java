class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if (root==null){
            return arr;
        }
        Stack<TreeNode> q=new Stack<>();
        q.push(root);
        while (!q.isEmpty()){
            TreeNode curr=q.pop();
            arr.add(curr.val);

            if (curr.right!=null){
                q.push(curr.right);
            }
            if (curr.left!=null){
                q.push(curr.left);
            }
        }

        return arr;
    }
}