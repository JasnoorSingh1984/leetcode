class Solution {
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        putele(root,map);

        TreeNode target=find(root,start);

        Queue<TreeNode> q=new LinkedList<>();
        HashSet<TreeNode> set=new HashSet<>();
        q.add(target);
        set.add(target);
        int count=0;

        while (!q.isEmpty()){
            int size=q.size();
            count++;
            for (int i=0;i<size;i++){
                TreeNode curr=q.remove();
                if (curr.left!=null && !set.contains(curr.left)){
                    q.add(curr.left);
                    set.add(curr.left);
                }
                if (curr.right!=null && !set.contains(curr.right)){
                    q.add(curr.right);
                    set.add(curr.right);
                }
                if (map.containsKey(curr) && !set.contains(map.get(curr))){
                    q.add(map.get(curr));
                    set.add(map.get(curr));
                }
            }
        }

        return count-1;
    }

    public TreeNode find(TreeNode root, int start) {
        if (root == null) return null;

        if (root.val == start) return root;

        TreeNode left = find(root.left, start);
        if (left != null) return left;

        return find(root.right, start);
    }


    public void putele(TreeNode root,HashMap<TreeNode,TreeNode> map){
        if (root==null) return;

        if (root.left!=null) map.put(root.left,root);
        if (root.right!=null) map.put(root.right,root);

        putele(root.left,map);
        putele(root.right,map);
    }
}