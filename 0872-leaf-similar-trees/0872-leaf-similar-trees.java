class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1=new ArrayList<>();
        find(root1,arr1);

        List<Integer> arr2=new ArrayList<>();
        find(root2,arr2);

        return arr1.equals(arr2);
    }

    public void find(TreeNode root,List<Integer> arr){
        if (root==null) return;

        if (root.left==null && root.right==null) {
            arr.add(root.val);
        }

        find(root.left,arr);
        find(root.right,arr);
    }
}