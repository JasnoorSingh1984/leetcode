class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        if (!isleaf(root)){
            arr.add(root.data);
        }
        addleft(root,arr);
        addleaf(root,arr);
        addright(root,arr);
        
        return arr;
    }
    
    boolean isleaf(Node root){
        return root.left==null && root.right==null;
    }
    
    void addleft(Node root,ArrayList<Integer> arr){
        Node curr=root.left;
        while (curr!=null){
            if (!isleaf(curr)){
                arr.add(curr.data);
            }
            
            if (curr.left!=null){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
    }
    
    void addright(Node root,ArrayList<Integer> arr){
        ArrayList<Integer> ans=new ArrayList<>();
        Node curr=root.right;
        while (curr!=null){
            if (!isleaf(curr)){
                ans.add(curr.data);
            }
            
            if (curr.right!=null){
                curr=curr.right;
            }else{
                curr=curr.left;
            }
        }
        
        for (int i=ans.size()-1;i>=0;i--){
            arr.add(ans.get(i));
        }
    }
    
    void addleaf(Node root,ArrayList<Integer> arr){
        if (isleaf(root)){
            arr.add(root.data);
            return;
        }
        
        if (root.left!=null){
            addleaf(root.left,arr);
        }
        if (root.right!=null){
            addleaf(root.right,arr);
        }
    }
}