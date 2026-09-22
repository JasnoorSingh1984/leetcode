class Solution {
    public void flatten(TreeNode root) {
        if (root==null){
            return;
        }
        
        ArrayList<TreeNode> arr=new ArrayList<>();
        putEle(root,arr);

        for (int i=0;i<arr.size()-1;i++){
            arr.get(i).left=null;
            arr.get(i).right=arr.get(i+1);
        }

        arr.get(arr.size()-1).left=null;
        arr.get(arr.size()-1).right=null;
    }

    public void putEle(TreeNode root,ArrayList<TreeNode> arr){
        if (root==null){
            return;
        }

        arr.add(root);
        putEle(root.left,arr);
        putEle(root.right,arr);
    }
}