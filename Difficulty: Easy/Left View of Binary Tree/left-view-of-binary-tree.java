class Solution {
    public ArrayList<Integer> leftView(Node root) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        view(root,0,map);
        
        ArrayList<Integer> arr=new ArrayList<>();
        for (int val:map.values()){
            arr.add(val);
        }
        return arr;
    }
    
    public void view(Node root,int level,TreeMap<Integer,Integer> map){
        if (root==null){
            return;
        }
        
        if (!map.containsKey(level)){
            map.put(level,root.data);
        }
        
        view(root.left,level+1,map);
        view(root.right,level+1,map);
    }
}