class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set=new HashSet<>();
        return find(root,k,set);
    }

    public boolean find(TreeNode root,int k,HashSet<Integer> set){
        if (root==null) return false;

        int rem=k-root.val;
        if (set.contains(rem)) return true;
        set.add(root.val);

        return find(root.left,k,set) ||  find(root.right,k,set);
    }
}