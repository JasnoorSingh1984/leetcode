class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    public TreeNode build(int[] nums,int low,int high){
        if (low>high) return null;

        int mid=low+(high-low)/2;

        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums,low,mid-1);
        root.right=build(nums,mid+1,high);

        return root;
    }
}