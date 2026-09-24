class Solution {
    int camara;
    public int minCameraCover(TreeNode root) {
        camara=0;
        int state=find(root);

        if (state==-1) camara++;

        return camara;
    }

    public int find(TreeNode root){
        if (root==null){
            return 1;
        }

        int ls=find(root.left);
        int rs=find(root.right);

        if (ls==-1 || rs==-1){
            camara++;
            return 0;
        }

        if (ls==0 || rs==0){
            return 1;
        }

        return -1;
    }
}