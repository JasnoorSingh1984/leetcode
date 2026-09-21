class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] max=new int[1];
        find(root,max);
        return max[0];
    }

    public int find(TreeNode root,int[] max){
        if (root==null){
            return 0;
        }

        int l=find(root.left,max);
        int r=find(root.right,max);

        max[0]=Math.max(max[0],l+r);

        return 1+Math.max(l,r);
    }
}