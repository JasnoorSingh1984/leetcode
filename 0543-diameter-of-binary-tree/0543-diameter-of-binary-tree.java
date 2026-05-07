class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] arr=new int[1];
        check(root,arr);
        return arr[0];
    }

    public int check(TreeNode root,int[] arr){
        if (root==null){
            return 0;
        }

        int ls=check(root.left,arr);
        int rs=check(root.right,arr);

        arr[0]=Math.max(arr[0],ls+rs);

        return 1+Math.max(ls,rs);
    }
}