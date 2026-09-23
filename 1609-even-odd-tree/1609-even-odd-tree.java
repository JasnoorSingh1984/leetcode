class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root==null) return false;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        while (!q.isEmpty()){
            int size=q.size();
            int max=0;
            if (level%2!=0){
                max=Integer.MIN_VALUE;
            }else{
                max=Integer.MAX_VALUE;
            }
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();

                if (level%2!=0){
                    if (curr.val<=max) return false;
                    if (curr.val%2==0) return false;
                    max=curr.val;
                }else{
                    if (curr.val>=max) return false;
                    if (curr.val%2!=0) return false;
                    max=curr.val;
                }

                if (curr.left!=null){
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }

            level++;
        }

        return true;
    }
}