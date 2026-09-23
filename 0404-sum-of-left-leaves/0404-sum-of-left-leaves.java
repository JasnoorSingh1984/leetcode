class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int[] arr=new int[1];
        sum(root,arr);
        return arr[0];
    }

    public void sum(TreeNode root,int[] arr){
        if (root==null){
            return;
        }

        if (root.left!=null && root.left.left==null && root.left.right==null){
            arr[0]+=root.left.val;
        }

        sum(root.left,arr);
        sum(root.right,arr);
    }
}