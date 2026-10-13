class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] idx=new int[1];
        return build(preorder,idx,Long.MAX_VALUE);
    }

    public TreeNode build(int[] arr,int[] idx,long max){
        if (idx[0]>=arr.length || arr[idx[0]]>=max) return null;

        TreeNode root=new TreeNode(arr[idx[0]++]);
        root.left=build(arr,idx,root.val);
        root.right=build(arr,idx,max);

        return root;
    }
}