class quad{
    long max;
    long min;
    long sum;
    boolean isbst;
    quad(long max,long min,long sum,boolean isbst){
        this.max=max;
        this.min=min;
        this.sum=sum;
        this.isbst=isbst;
    }
}

class Solution {
    long maxsum;
    public int maxSumBST(TreeNode root) {
        maxsum=0;
        check(root);
        return (int) maxsum;
    }

    quad check(TreeNode root){
        if (root==null) return new quad(Long.MIN_VALUE,Long.MAX_VALUE,0,true);

        quad left=check(root.left);
        quad right=check(root.right);

        boolean flag=left.isbst && right.isbst && (left.max < root.val) && (right.min > root.val);

        if (flag){
            long sum=root.val + left.sum + right.sum;

            long max=Math.max(root.val,Math.max(left.max,right.max));
            long min=Math.min(root.val,Math.min(left.min,right.min));

            maxsum=Math.max(maxsum,sum);

            return new quad(max,min,sum,true);
        }

        return new quad(Long.MAX_VALUE,Long.MIN_VALUE,0,false);
    }
}