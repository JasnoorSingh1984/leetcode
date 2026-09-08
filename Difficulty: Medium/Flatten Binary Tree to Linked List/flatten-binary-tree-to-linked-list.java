
class Solution {
    public static void flatten(Node root) {
        ArrayList<Node> arr=new ArrayList<>();
        inorder(root,arr);
        
        for (int i=0;i<arr.size()-1;i++){
            arr.get(i).left=null;
            arr.get(i).right=arr.get(i+1);
        }
        
        if (!arr.isEmpty()){
            arr.get(arr.size()-1).left=null;
            arr.get(arr.size()-1).right=null;
        }
    }
    
    public static void inorder(Node root,ArrayList<Node> arr){
        if (root==null){
            return;
        }
        
        arr.add(root);
        inorder(root.left,arr);
        inorder(root.right,arr);
    }
}