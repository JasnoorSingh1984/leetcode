class Solution {
    int mod=(int)Math.pow(10,9)+7;
    public int maxProduct(TreeNode root) {
        long[] max=new long[1];
        long sum=sumof(root);

        find(root,max,sum);

        return (int)(max[0]%mod);
    }

    public long find(TreeNode root,long[] max,long sum){
        if (root==null) return 0;

        long ls=find(root.left,max,sum);
        long rs=find(root.right,max,sum);
        long total=root.val+ls+rs;

        max[0]=Math.max(max[0],total*(sum-total));

        return total;
    }

    public long sumof(TreeNode root){
        if (root==null) return 0;

        return root.val + sumof(root.left) + sumof(root.right);
    }
}