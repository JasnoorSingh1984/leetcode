class Solution {
    public int maxAncestorDiff(TreeNode root) {
        int[] max=new int[1];
        find(root,max,root.val,root.val);
        return max[0];
    }

    public void find(TreeNode root,int[] max,int maxi,int mini){
        if (root==null) return;

        max[0]=Math.max(max[0],Math.abs(root.val-maxi));
        max[0]=Math.max(max[0],Math.abs(root.val-mini));

        maxi=Math.max(root.val,maxi);
        mini=Math.min(root.val,mini);

        find(root.left,max,maxi,mini);
        find(root.right,max,maxi,mini);
    }
}