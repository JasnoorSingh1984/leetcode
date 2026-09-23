class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root==null){
            return false;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer> arr=new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();
                arr.add(curr.val);

                if (curr.left!=null && curr.right!=null && ((curr.left.val==x && curr.right.val==y) ||
                                                            (curr.left.val==y && curr.right.val==x))){
                    return false;
                }

                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }

            for (int val:arr){
                if (arr.contains(x) && arr.contains(y)){
                    return true;
                }
            }
        }

        return false;
    }
}