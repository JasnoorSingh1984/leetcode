class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        if (root==null){
            return arr;
        }
        
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        Queue<Node> nodeq=new LinkedList<>();
        Queue<Integer> hdq=new LinkedList<>();
        nodeq.add(root);
        hdq.add(0);
        
        while (!nodeq.isEmpty()){
            Node curr=nodeq.remove();
            int hd=hdq.remove();
            
            if (!map.containsKey(hd)){
                map.put(hd,curr.data);
            }else{
                map.put(hd,curr.data);
            }
            
            if (curr.left!=null){
                nodeq.add(curr.left);
                hdq.add(hd-1);
            }
            if (curr.right!=null){
                nodeq.add(curr.right);
                hdq.add(hd+1);
            }
        }
        
        for (int val:map.values()){
            arr.add(val);
        }
        
        return arr;
    }
}