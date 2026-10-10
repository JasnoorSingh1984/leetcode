class Solution {
    int[] level;
    int[] height;
    int[] max;
    int[] sec;
    public int[] treeQueries(TreeNode root, int[] queries) {
        level=new int[1000001];
        height=new int[1000001];
        max=new int[1000001];
        sec=new int[1000001];
        levels(root,0);

        int[] arr=new int[queries.length];
        for (int i=0;i<queries.length;i++){
            int l=level[queries[i]];
            int h;
            if (height[queries[i]]==max[l]) h=sec[l];
            else h=max[l];

            arr[i]=l+h-1;
        }

        return arr;
    }

    public int levels(TreeNode root,int l){
        if (root==null) return 0;

        level[root.val]=l;
        int left=levels(root.left,l+1);
        int right=levels(root.right,l+1);

        height[root.val]=Math.max(left,right)+1;

        if (max[l]<height[root.val]){
            sec[l]=max[l];
            max[l]=height[root.val];
        }else if (height[root.val]>sec[l]){
            sec[l]=height[root.val];
        }

        return 1+Math.max(left,right);
    }

}