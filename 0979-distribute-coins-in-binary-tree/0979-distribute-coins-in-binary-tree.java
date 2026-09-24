class Solution {
    public int distributeCoins(TreeNode root) {
        int[] moves=new int[1];
        find(root,moves);
        return moves[0];
    }

    public int find(TreeNode root,int[] moves){
        if (root==null){
            return 0;
        }

        int left=find(root.left,moves);
        int right=find(root.right,moves);

        moves[0]+=Math.abs(left);
        moves[0]+=Math.abs(right);

        return root.val + left + right -1;
    }
}