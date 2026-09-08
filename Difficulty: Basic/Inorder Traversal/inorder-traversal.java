class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return arr;
    }
    
    public void inorder(Node root,ArrayList<Integer> arr){
        if (root==null){
            return;
        }
        
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
}