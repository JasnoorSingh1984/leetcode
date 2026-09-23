class Solution {
    public int findBottomLeftValue(TreeNode root) {
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

        for (int i=arr.size()-1;i>=0;i--){
            List<Integer> l=arr.get(i);
            return l.get(0);
        }
        return -1;
    }
}