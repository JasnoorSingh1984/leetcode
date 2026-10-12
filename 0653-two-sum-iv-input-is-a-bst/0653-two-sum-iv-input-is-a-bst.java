class Solution {
    boolean flag;
    public boolean findTarget(TreeNode root, int k) {
        flag=false;
        HashSet<Integer> set=new HashSet<>();
        find(root,k,set);
        return flag;
    }

    public void find(TreeNode root,int k,HashSet<Integer> set){
        if (root==null) return;

        int rem=k-root.val;
        if (set.contains(rem)) flag=true;
        set.add(root.val);

        find(root.left,k,set);
        find(root.right,k,set);
    }
}