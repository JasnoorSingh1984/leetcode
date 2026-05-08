class Solution {
    boolean isLeaf(Node root){
        if (root.left==null && root.right==null){
            return true;
        }
        return false;
    }
    void addleft(Node root,ArrayList<Integer> res){
        Node curr=root.left;
        while (curr!=null){
            if (!isLeaf(curr)){
                res.add(curr.data);
            }
            
            if (curr.left!=null){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
    }
    void addright(Node root,ArrayList<Integer> res){
        ArrayList<Integer> arr=new ArrayList<>();
        Node curr=root.right;
        while (curr!=null){
            if (!isLeaf(curr)){
                arr.add(curr.data);
            }
            
            if (curr.right!=null){
                curr=curr.right;
            }else{
                curr=curr.left;
            }
        }
        
        for (int i=arr.size()-1;i>=0;i--){
            res.add(arr.get(i));
        }
    }
    
    void addleaf(Node root,ArrayList<Integer> res){
        if (isLeaf(root)){
            res.add(root.data);
            return;
        }
        
        if (root.left!=null){
            addleaf(root.left,res);
        }
        if (root.right!=null){
            addleaf(root.right,res);
        }
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        if (root==null){
            return arr;
        }
        
        if (!isLeaf(root)){
            arr.add(root.data);
        }
        
        addleft(root,arr);
        addleaf(root,arr);
        addright(root,arr);
        
        return arr;
    }
}