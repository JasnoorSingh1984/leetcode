class Solution {
    public int sumNumbers(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        
        int[] ans=new int[1];
        paths(root,arr,"",ans);

        return ans[0];
    }

    public void paths(TreeNode root,List<Integer> arr,String str,int[] ans){
        if (root==null) return;

        if (root.left==null && root.right==null){
            str=str+root.val;
            ans[0]+=Integer.parseInt(str);
            return;
        }

        paths(root.left,arr,str+root.val,ans);
        paths(root.right,arr,str+root.val,ans);
    }
}