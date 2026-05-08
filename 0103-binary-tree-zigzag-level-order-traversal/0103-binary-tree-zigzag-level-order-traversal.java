class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if (root==null){
            return arr;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while (!q.isEmpty()){
            int size=q.size();

            List<Integer> l=new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();

                if (flag){
                    l.add(curr.val);
                }else{
                    l.add(0,curr.val);
                }

                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }
            arr.add(l);
            flag=!flag;
        }

        return arr;
    }
}