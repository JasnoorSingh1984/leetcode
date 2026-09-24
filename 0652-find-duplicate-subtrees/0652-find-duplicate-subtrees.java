class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> arr=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();

        find(root,arr,map);
        return arr;
    }

    public String find(TreeNode root,List<TreeNode> arr,HashMap<String,Integer> map){
        if (root==null){
            return "#";
        }

        String left=find(root.left,arr,map);
        String right=find(root.right,arr,map);

        String key=root.val + ","  + left + "," + right;

        int count=0;
        if (map.containsKey(key)) count=map.get(key);
        
        if (count==1){
            arr.add(root);
        }

        map.put(key,count+1);
        return key;
    }
}