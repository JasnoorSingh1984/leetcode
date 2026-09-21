class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        path(root,targetSum,arr,l);
        return arr;
    }

    public void path(TreeNode root,int sum,List<List<Integer>> arr,List<Integer> l){
        if (root==null){
            return ;
        }

        if (root.left==null && root.right==null){
            if (sum==root.val){
                l.add(root.val);
                arr.add(new ArrayList<>(l));
                l.remove(l.size()-1);
            }
            return;
        }

        l.add(root.val);
        path(root.left,sum-root.val,arr,l);
        path(root.right,sum-root.val,arr,l);
        l.remove(l.size()-1);
    }
}