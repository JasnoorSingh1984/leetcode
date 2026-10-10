class FindElements {
    HashSet<Integer> set;
    public FindElements(TreeNode root) {
        set=new HashSet<>();
        find(root,0);
    }

    public void find(TreeNode root,int x){
        if (root==null) return;

        root.val=x;
        set.add(x);
        find(root.left,2*x+1);
        find(root.right,2*x+2);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}
