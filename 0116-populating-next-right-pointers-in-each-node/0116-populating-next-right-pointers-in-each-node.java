class Solution {
    public Node connect(Node root) {
        if (root==null){
            return root;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            List<Node> l=new ArrayList<>();
            
            for (int i=0;i<size;i++){
                Node curr=q.remove();
                l.add(curr);

                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }

            for (int i=0;i<l.size();i++){
                if (i==l.size()-1){
                    l.get(i).next=null;
                }else{
                    l.get(i).next=l.get(i+1);
                }
            }
        }

        return root;
    }
}