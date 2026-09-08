
class Solution {
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        
        answer(root,sum,arr,l);
        return arr;
    }
    
    public void answer(Node root,int sum,ArrayList<ArrayList<Integer>> arr,ArrayList<Integer> l){
        if (root==null){
            return;
        }
        
        l.add(root.data);
        
        if (sum==root.data){
            arr.add(new ArrayList<>(l));
        }
        
        answer(root.left,sum-root.data,arr,l);
        answer(root.right,sum-root.data,arr,l);
        
        l.remove(l.size()-1);
    }
}