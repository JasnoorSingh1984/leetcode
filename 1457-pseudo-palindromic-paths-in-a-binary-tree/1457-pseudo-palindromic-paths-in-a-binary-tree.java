class Solution {
    public int pseudoPalindromicPaths(TreeNode root) {
        int[] result=new int[1];
        int[] freq = new int[10];
        paths(root,freq,result);
        return result[0];
    }

    public void paths(TreeNode root,int[] freq,int[] result) {
        if (root == null) return ;

        if (root.left == null && root.right == null) {
            freq[root.val]++;

            int odd = 0;
            for (int i = 1; i <= 9; i++) {
                if (freq[i] % 2 != 0) {
                    odd++;
                }
            }

            if (odd<=1){
                result[0]++;
            }

            freq[root.val]--;
            return;
        }

        freq[root.val]++;
        paths(root.left,freq,result);
        paths(root.right,freq,result);
        freq[root.val]--;
    }
}