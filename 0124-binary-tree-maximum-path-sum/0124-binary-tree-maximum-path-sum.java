class Solution {
    public int maxPathSum(TreeNode root) {
        int[] arr=new int[1];
        arr[0]=Integer.MIN_VALUE;
        check(root,arr);
        return arr[0];
    }

    public int check(TreeNode root,int[] arr){
        if (root==null){
            return 0;
        }

        int ls=Math.max(0,check(root.left,arr));
        int rs=Math.max(0,check(root.right,arr));

        arr[0]=Math.max(arr[0],root.val+ls+rs);

        return root.val + Math.max(ls,rs);
    }
}