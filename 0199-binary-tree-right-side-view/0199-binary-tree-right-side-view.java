class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        view(root,0,map);

        List<Integer> arr=new ArrayList<>();
        for (int val:map.values()){
            arr.add(val);
        }
        return arr;
    }

    public void view(TreeNode root,int level,TreeMap<Integer,Integer> map){
        if (root==null){
            return;
        }

        map.put(level,root.val);

        view(root.left,level+1,map);
        view(root.right,level+1,map);
    }
}