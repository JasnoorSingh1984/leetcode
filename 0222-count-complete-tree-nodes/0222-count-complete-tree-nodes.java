class Solution {
    public int countNodes(TreeNode root) {
        if (root==null){
            return 0;
        }

        int count=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();

            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();
                count++;

                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }
        }

        return count;
    }
}