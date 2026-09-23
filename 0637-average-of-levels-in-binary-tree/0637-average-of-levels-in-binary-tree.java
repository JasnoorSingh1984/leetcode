class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();
                l.add(curr.val);

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }

            arr.add(l);
        }

        List<Double> ans=new ArrayList<>();
        for (List<Integer> l:arr){
            double sum=0;
            for (int i=0;i<l.size();i++){
                sum+=l.get(i);
            }
            double avg=sum/l.size();
            ans.add(avg);
        }

        return ans;
    }
}