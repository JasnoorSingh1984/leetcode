class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max=new int[1];
        max[0]=Integer.MIN_VALUE;
        find(root,max);
        return max[0];
    }

    public int find(TreeNode root,int[] arr){
        if (root==null){
            return 0;
        }

        int ls=Math.max(0,find(root.left,arr));
        int rs=Math.max(0,find(root.right,arr));

        arr[0]=Math.max(arr[0],root.val+ls+rs);

        return root.val + Math.max(ls,rs);
    }
}