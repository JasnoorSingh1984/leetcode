class Solution {
    public int averageOfSubtree(TreeNode root) {
        int[] res=new int[1];
        find(root,res);
        return res[0];
    }

    public int[] find(TreeNode root,int[] res){
        if (root==null) return new int[]{0,0};

        int[] left=find(root.left,res);
        int[] right=find(root.right,res);

        int sum=root.val + left[0] + right[0];
        int count= 1 + left[1] + right[1];

        if (sum/count==root.val) res[0]++;

        return new int[]{sum,count};
    }
}