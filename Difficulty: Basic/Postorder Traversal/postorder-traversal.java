class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        postorder(root,arr);
        return arr;
    }
    
    public void postorder(Node root,ArrayList<Integer> arr){
        if (root==null){
            return;
        }
        
        postorder(root.left,arr);
        postorder(root.right,arr);
        arr.add(root.data);
    }
}