class Solution {
    public int sumNumbers(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        check(root,arr,"");
        
        int count=0;
        for (int i=0;i<arr.size();i++){
            count+=arr.get(i);
        }

        return count;
    }

    public void check(TreeNode root,List<Integer> arr,String str){
        if (root==null){
            return;
        }

        if (root.left==null && root.right==null){
            str=str+root.val;
            int num=Integer.parseInt(str);
            arr.add(num);
        }

        check(root.left,arr,str+root.val);
        check(root.right,arr,str+root.val);
    }
}