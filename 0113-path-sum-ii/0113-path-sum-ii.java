class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        check(root,targetSum,arr,l);
        return arr;
    }

    public void check(TreeNode root,int tar,List<List<Integer>> arr,List<Integer> l){
        if (root==null){
            return;
        }

        l.add(root.val);

        if (root.left==null && root.right==null){
            if (tar==root.val){
                arr.add(new ArrayList<>(l));
            }
            l.remove(l.size()-1);
            return;
        }

        check(root.left,tar-root.val,arr,l);
        check(root.right,tar-root.val,arr,l);

        l.remove(l.size()-1);
    }
}