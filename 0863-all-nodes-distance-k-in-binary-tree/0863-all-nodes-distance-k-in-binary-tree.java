class Solution {
    HashMap<TreeNode,TreeNode> map;

    public void inorder(TreeNode root){
        if (root==null) return;

        if (root.left!=null){
            map.put(root.left,root);
        }
        if (root.right!=null){
            map.put(root.right,root);
        }

        inorder(root.right);
        inorder(root.left);
    }

    public void find(TreeNode target,int k,List<Integer> arr){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);

        HashSet<TreeNode> set=new HashSet<>();
        set.add(target);
        while (!q.isEmpty()){
            int size=q.size();
            if (k==0){
                break;
            }

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

            k--;
        }

        while (!q.isEmpty()){
            arr.add(q.remove().val);
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> arr=new ArrayList<>();
        map=new HashMap<>();

        inorder(root);

        find(target,k,arr);

        return arr;
    }
}