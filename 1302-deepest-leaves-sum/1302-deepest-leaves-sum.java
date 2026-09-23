class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if (root==null){
            return 0;
        }

        int answer=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();

                sum+=curr.val;

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }

            answer=sum;
        }

        return answer;
    }
}