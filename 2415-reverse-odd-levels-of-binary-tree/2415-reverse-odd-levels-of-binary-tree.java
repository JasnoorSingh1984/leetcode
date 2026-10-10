class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root==null) return root;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while (!q.isEmpty()){
            int size=q.size();
            List<TreeNode> arr=new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();
                arr.add(curr);

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }

            if (level%2!=0){
                int left=0;
                int right=arr.size()-1;

                while (left<right){
                    int val=arr.get(left).val;
                    arr.get(left).val=arr.get(right).val;
                    arr.get(right).val=val;
                    left++;
                    right--;
                }
            }

            level++;
        }

        return root;
    }
}