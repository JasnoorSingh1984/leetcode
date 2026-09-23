class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root==null){
            return 1;
        }

        int maxsum=Integer.MIN_VALUE;
        int maxlevel=1;
        int level=1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();

                sum+=curr.val;

                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }

            if (sum>maxsum){
                maxsum=sum;
                maxlevel=level;
            }
            level++;
        }

        return maxlevel;
    }
}