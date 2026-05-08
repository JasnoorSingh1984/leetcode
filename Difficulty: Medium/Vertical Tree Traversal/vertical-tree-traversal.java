class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        if (root==null){
            return arr;
        }

        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();

        Queue<Node> nodeq=new LinkedList<>();
        Queue<Integer> hdq=new LinkedList<>();
        nodeq.add(root);
        hdq.add(0);

        while (!nodeq.isEmpty()){
            Node curr=nodeq.remove();
            int hd=hdq.remove();

            if (map.containsKey(hd)){
                ArrayList<Integer> list=map.get(hd);
                list.add(curr.data);
                map.put(hd,list);
            }else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(curr.data);
                map.put(hd,list);
            }

            if (curr.left!=null){
                nodeq.add(curr.left);
                hdq.add(hd-1);
            }
            if(curr.right!=null){
                nodeq.add(curr.right);
                hdq.add(hd+1);
            }
        }

        for (ArrayList<Integer> list:map.values()){
            arr.add(list);
        }

        return arr;  
    }
}