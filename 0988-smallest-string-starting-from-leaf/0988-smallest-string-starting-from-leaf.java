class Solution {
    public String smallestFromLeaf(TreeNode root) {
        String[] max=new String[1];
        max[0]="";
        StringBuilder str=new StringBuilder();
        find(root,str,max);
        return max[0];
    }

    public void find(TreeNode root,StringBuilder str,String[] max){
        if (root==null) return;

        if (root.left==null && root.right==null){
            str.insert(0,(char)('a' + root.val));
            String curr=str.toString();
            if (max[0].equals("") || curr.compareTo(max[0])<0){
                max[0]=curr;
            }
            str.deleteCharAt(0);
            return;
        }

        str.insert(0,(char)('a' + root.val));
        find(root.left,str,max);
        find(root.right,str,max);
        str.deleteCharAt(0);
    }
}