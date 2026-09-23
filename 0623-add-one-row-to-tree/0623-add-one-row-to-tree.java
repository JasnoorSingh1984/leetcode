class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        
        int level=1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();

            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();

                if (level==depth-1){
                    TreeNode node=new TreeNode(val);
                    TreeNode temp=curr.left;
                    curr.left=node;
                    node.left=temp;
                    
                    TreeNode node1=new TreeNode(val);
                    TreeNode temp1=curr.right;
                    curr.right=node1;
                    node1.right=temp1;
                }

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }

            if (level==depth-1){
                break;
            }
            level++;
        }

        return root;
    }
}