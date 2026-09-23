class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int ans=-1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();

                if (i==0) ans=curr.val;

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }
        }
        return ans;
    }
}