class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        if (root==null){
            return ans;
        }

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

        for (List<Integer> list:arr){
            ans.add(list.get(list.size()-1));
        }

        return ans;
    }
}