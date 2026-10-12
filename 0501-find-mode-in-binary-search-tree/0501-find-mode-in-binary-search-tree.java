class Solution {
    int max;
    public int[] findMode(TreeNode root) {
        max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        find(root,map);

        List<Integer> arr=new ArrayList<>();
        for (int val:map.keySet()){
            if (map.get(val)==max) arr.add(val);
        }

        int[] ans=new int[arr.size()];
        for (int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }

        return ans;
    }

    void find(TreeNode root,HashMap<Integer,Integer> map){
        if (root==null) return;

        if (map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
            if (map.get(root.val)>max) max=map.get(root.val);
        }else {
            map.put(root.val,1);
            if (map.get(root.val)>max) max=map.get(root.val);
        }

        find(root.left,map);
        find(root.right,map);
    }
}