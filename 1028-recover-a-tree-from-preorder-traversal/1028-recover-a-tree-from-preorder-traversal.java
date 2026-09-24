class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        int[] idx=new int[1];

        return find(traversal,idx,0);
    }

    public TreeNode find(String str,int[] idx,int depth){
        int i=idx[0];

        int dash=0;
        while (i<str.length() && str.charAt(i)=='-'){
            dash++;
            i++;
        }

        if (dash!=depth) return null;

        int num=0;
        while (i<str.length() && Character.isDigit(str.charAt(i))){
            num=num*10 + (str.charAt(i)-'0');
            i++;
        }

        idx[0]=i;

        TreeNode root=new TreeNode(num);
        root.left=find(str,idx,depth+1);
        root.right=find(str,idx,depth+1);

        return root;
    }
}