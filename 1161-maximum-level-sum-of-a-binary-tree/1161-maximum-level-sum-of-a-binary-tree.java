class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root==null){
            return 1;
        }

        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();

            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();

                l.add(curr.val);

                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }

            arr.add(l);
        }

        int max=Integer.MIN_VALUE;
        int pos=0;
        int idx=0;
        for (List<Integer> list:arr){
            int sum=0;
            idx++;
            for (int i=0;i<list.size();i++){
                sum+=list.get(i);
            }
            if (sum>max){
                max=sum;
                pos=idx;
            }
        }

        return pos;
    }
}