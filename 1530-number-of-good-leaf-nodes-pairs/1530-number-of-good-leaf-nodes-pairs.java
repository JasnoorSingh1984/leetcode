class Solution {
    int count;
    public int countPairs(TreeNode root, int distance) {
        count=0;
        find(root,distance);
        return count;
    }

    public List<Integer> find(TreeNode root,int dis){
        List<Integer> arr=new ArrayList<>();

        if (root==null) return arr;

        if (root.left==null && root.right==null) {
            arr.add(1);
            return arr;
        }

        List<Integer> left=find(root.left,dis);
        List<Integer> right=find(root.right,dis);

        for (int i:left){
            for (int j:right){
                if (i+j<=dis){
                    count++;
                }
            }
        }

        for (int i:left){
            if (i+1<=dis){
                arr.add(i+1);
            }
        }

        for (int j:right){
            if (j+1<=dis){
                arr.add(j+1);
            }
        }

        return arr;
    }
}