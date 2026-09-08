class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        view(root,0,arr);
        return arr;
    }
    
    public void view(Node root,int level,ArrayList<Integer> arr){
        if (root==null){
            return;
        }
        
        if (level >= arr.size()){
            arr.add(root.data);
        }else{
            arr.set(level,root.data);
        }
        
        view(root.left,level+1,arr);
        view(root.right,level+1,arr);
    }
}