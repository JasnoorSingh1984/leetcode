class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean[] arr=new boolean[1];
        check(root,targetSum,arr);
        return arr[0];
    }

    public void check(TreeNode root,int tar,boolean[] arr){
        if (root==null){
            return;
        }

        if (root.left==null && root.right==null){
            if (tar==root.val){
                arr[0]=true;
                return;
            }
        }

        check(root.left,tar-root.val,arr);
        check(root.right,tar-root.val,arr);
    }
}