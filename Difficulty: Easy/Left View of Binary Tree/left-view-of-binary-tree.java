class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if (root==null){
            return ans;
        }
        
        List<List<Integer>> arr=new ArrayList<>();
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
            arr.add(l);
        }
        
        for (List<Integer> list:arr){
            ans.add(list.get(0));
        }
        
        return ans;
    }
}