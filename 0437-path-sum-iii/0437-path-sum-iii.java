class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root==null) return 0;

        return sum(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }

    public int sum(TreeNode root,long target){
        if (root==null){
            return 0;
        }

        int count=0;
        if (target==root.val){
            count++;
        }

        count+=sum(root.left,target-root.val);
        count+=sum(root.right,target-root.val);

        return count;
    }
}