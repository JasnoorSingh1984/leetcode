class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);

        int sum=0;
        for (int i=0;i<arr.size();i++){
            if (arr.get(i)>=low && arr.get(i)<=high){
                sum+=arr.get(i);
            }
        }

        return sum;
    }

    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if (root==null){
            return;
        }

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}