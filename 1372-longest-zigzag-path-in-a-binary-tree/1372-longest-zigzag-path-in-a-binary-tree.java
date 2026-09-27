class Solution {
    int max;
    public int longestZigZag(TreeNode root) {
        max=0;
        find(root,true,0);
        find(root,false,0);
        return max;
    }

    public void find(TreeNode root,boolean bool,int count){
        if (root==null) return;

        max=Math.max(max,count);

        if (bool){
            if (root.right!=null) find(root.right,false,count+1);
            if (root.left!=null) find(root.left,true,1);
        }else{
            if (root.left!=null) find(root.left,true,count+1);
            if (root.right!=null) find(root.right,false,1);
        }
    }
}