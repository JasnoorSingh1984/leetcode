class Solution {
    public void leftadd(Node root,List<Integer> arr){
        if (root==null){
            return ;
        }
        
        while (root.left!=null || root.right!=null){
            arr.add(root.data);
            if (root.left!=null){
                root=root.left;
            }else{
                root=root.right;
            }
        }
    }
    
    public void leafadd(Node root,List<Integer> arr){
        if (root==null){
            return;
        }
        
        if (root.left==null && root.right==null){
            arr.add(root.data);
        }
        
        leafadd(root.left,arr);
        leafadd(root.right,arr);
    }
    
    public void rightadd(Node root,List<Integer> arr){
        if (root==null){
            return;
        }
        
        while (root.left!=null || root.right!=null){
            arr.add(0,root.data);
            if (root.right!=null){
                root=root.right;
            }else{
                root=root.left;
            }
        }
        
        arr.remove(arr.size()-1);
    }
    
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(root.data);
        
        if (root.left!=null){
            List<Integer> left=new ArrayList<>();
            leftadd(root.left,left);
            arr.addAll(left);
        }
        
        if (root.left!=null || root.right!=null){
            List<Integer> leaf=new ArrayList<>();
            leafadd(root,leaf);
            arr.addAll(leaf);
        }
        
        if (root.right!=null){
            List<Integer> right=new ArrayList<>();
            rightadd(root,right);
            arr.addAll(right);
        }
        
        return arr;
    }
}