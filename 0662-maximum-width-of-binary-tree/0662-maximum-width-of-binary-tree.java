class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root==null){
            return 0;
        }

        int max=0;
        Queue<TreeNode> nodeq=new LinkedList<>();
        Queue<Integer> hdq=new LinkedList<>();
        nodeq.add(root);
        hdq.add(0);

        while (!nodeq.isEmpty()){
            int size=nodeq.size();
            int min=hdq.peek();

            int first=0,last=0;
            for (int i=0;i<size;i++){
                TreeNode curr=nodeq.remove();
                int idx=hdq.remove()-min;

                if (i==0){
                    first=idx;
                }
                if (i==size-1){
                    last=idx;
                }

                if (curr.left!=null){
                    nodeq.add(curr.left);
                    hdq.add(2*idx+1);
                }
                if (curr.right!=null){
                    nodeq.add(curr.right);
                    hdq.add(2*idx+2);
                }
            }

            max=Math.max(max,last-first+1);
        }

        return max;
    }
}