class Solution {
    public boolean isFullTree(Node root) {
        if (root.left==null && root.right==null){
            return true;
        }
        
        if (root.left==null || root.right==null){
            return false;
        }
        
        return isFullTree(root.left) && isFullTree(root.right);
    }
};