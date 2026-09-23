class Solution {
    public int goodNodes(TreeNode root) {
        int[] arr=new int[1];
        good(root,Integer.MIN_VALUE,arr);
        return arr[0];
    }

    public void good(TreeNode root,int max,int[] arr){
        if (root==null) return;

        if (root.val>=max){
            arr[0]++;
            max=root.val;
        }

        good(root.left,max,arr);
        good(root.right,max,arr);
    }
}