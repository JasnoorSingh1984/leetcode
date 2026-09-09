class Solution {
    public List<Integer> reverseLevelOrder(Node root) {
        List<Integer> arr=new ArrayList<Integer>();
        
        if (root==null){
            return arr;
        }
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            
            for (int i=0;i<size;i++){
                Node curr=q.remove();
                l.add(curr.data);
                
                if (curr.left!=null){
                    q.add(curr.left);
                }
                
                if (curr.right!=null){
                    q.add(curr.right);
                }
            }
            
            for (int i=l.size()-1;i>=0;i--){
                arr.add(0,l.get(i));
            }
        }
        
        return arr;
    }
}