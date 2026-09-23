class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        HashMap<Integer,Integer> levelsum=new HashMap<>();
        getlevelsum(root,0,levelsum);

        update(root,0,levelsum);
        root.val=0;
        return root;
    }

    public void update(TreeNode root,int level,HashMap<Integer,Integer> map){
        if (root==null){
            return;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            for (int i=0;i<size;i++){
                int sum=0;
                TreeNode curr=q.remove();
                
                if (curr.left!=null){
                    sum+=curr.left.val;
                    q.add(curr.left);
                }
                if (curr.right!=null){
                    sum+=curr.right.val;
                    q.add(curr.right);
                }

                if (curr.left!=null){
                    curr.left.val=map.get(level+1)-sum;
                }
                if (curr.right!=null){
                    curr.right.val=map.get(level+1)-sum;
                }
            }
            level++;
        }
    }

    public void getlevelsum(TreeNode root,int level,HashMap<Integer,Integer> map){
        if (root==null){
            return;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();
                
                sum+=curr.val;

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }

            map.put(level,sum);
            level++;
        }
    }
}