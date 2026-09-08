class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        if (root==null){
            return arr;
        }
        
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Node> nodeq=new LinkedList<>();
        Queue<Integer> posq=new LinkedList<>();
        
        nodeq.add(root);
        posq.add(0);
        
        while (!nodeq.isEmpty()){
            Node curr=nodeq.remove();
            int pos=posq.remove();
            
            if (!map.containsKey(pos)){
                map.put(pos,curr.data);
            }
            
            if (curr.left!=null){
                nodeq.add(curr.left);
                posq.add(pos-1);
            }
            
            if (curr.right!=null){
                nodeq.add(curr.right);
                posq.add(pos+1);
            }
        }
        
        for (int val:map.values()){
            arr.add(val);
        }
        
        return arr;
    }
}