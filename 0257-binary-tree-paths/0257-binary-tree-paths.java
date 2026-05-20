class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr=new ArrayList<>();
        check(root,arr,"");
        return arr;
    }

    public void check(TreeNode root,List<String> arr,String str){
        if (root==null){
            return;
        }

        if (root.left==null && root.right==null){
            arr.add(str + root.val);
            return;
        }

        check(root.left,arr,str + root.val + "->");
        check(root.right,arr,str + root.val + "->");
    }
}