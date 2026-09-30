class Solution {
    public TreeNode createBinaryTree(int[][] arr) {
        HashSet<TreeNode> set=new HashSet<>();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int r=arr[i][0];
            int n=arr[i][1];
            int p=arr[i][2];

            TreeNode root;
            if (map.containsKey(r)){
                root=map.get(r);
            }else{
                root=new TreeNode(r);
                map.put(r,root);
            }

            TreeNode node;
            if (map.containsKey(n)){
                node=map.get(n);
            }else{
                node=new TreeNode(n);
                map.put(n,node);
            }

            set.add(node);

            if (p==1){
                root.left=node;
            }else{
                root.right=node;
            }
        }

        for (TreeNode root:map.values()){
            if (!set.contains(root)){
                return root;
            }
        }

        return null;
    }
}