class Solution {
    public int sumNumbers(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        paths(root,arr,"");

        int sum=0;
        for (int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }

        return sum;
    }

    public void paths(TreeNode root,List<Integer> arr,String str){
        if (root==null) return;

        if (root.left==null && root.right==null){
            str=str+root.val;
            arr.add(Integer.parseInt(str));
            return;
        }

        paths(root.left,arr,str+root.val);
        paths(root.right,arr,str+root.val);
    }
}