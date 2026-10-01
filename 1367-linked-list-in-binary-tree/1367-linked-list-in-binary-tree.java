class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root==null) return false;

        return sum(head,root) || isSubPath(head,root.left) || isSubPath(head,root.right);
    }

    public boolean sum(ListNode head,TreeNode root){
        if (head==null) return true;
        
        if (root==null) return false;

        if (head.val!=root.val) return false;

        return sum(head.next,root.left) || sum(head.next,root.right);
    }
}