class Solution {
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        path(root,sum,arr,l);
        return arr;
    }
    
    public void path(Node root,int sum,ArrayList<ArrayList<Integer>> arr,ArrayList<Integer> l){
        if (root==null){
            return;
        }
        
        if (root.data==sum){
            l.add(root.data);
            arr.add(new ArrayList<>(l));
            l.remove(l.size()-1);
        }
        
        l.add(root.data);
        path(root.left,sum-root.data,arr,l);
        path(root.right,sum-root.data,arr,l);
        l.remove(l.size()-1);
    }
}