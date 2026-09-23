class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            double sum=0;
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();
                sum+=curr.val;

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }
            double avg=sum/size;
            ans.add(avg);
        }

        return ans;
    }
}