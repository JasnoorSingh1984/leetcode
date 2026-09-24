class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        TreeMap<Integer,List<int[]>> map=new TreeMap<>();

        find(root,map);
        for (List<int[]> l:map.values()){
            Collections.sort(l,(a,b) ->{
                if (a[0]==b[0]){
                    return a[1]-b[1];
                }

                return a[0]-b[0];
            });

            List<Integer> temp=new ArrayList<>();
            for (int[] a:l){
                temp.add(a[1]);
            }

            arr.add(temp);
        }

        return arr;
    }

    public void find(TreeNode root,TreeMap<Integer,List<int[]>> map){
        Queue<TreeNode> nodeq=new LinkedList<>();
        Queue<Integer> posq=new LinkedList<>();
        Queue<Integer> rowq=new LinkedList<>();

        nodeq.add(root);
        posq.add(0);
        rowq.add(0);
        while (!nodeq.isEmpty()){
            TreeNode curr=nodeq.remove();
            int pos=posq.remove();
            int row=rowq.remove();

            if (map.containsKey(pos)){
                List<int[]> l=map.get(pos);
                l.add(new int[]{row,curr.val});
                map.put(pos,l);
            }else{
                List<int[]> l=new ArrayList<>();
                l.add(new int[]{row,curr.val});
                map.put(pos,l);
            }

            if (curr.left!=null){
                nodeq.add(curr.left);
                posq.add(pos-1);
                rowq.add(row+1);
            }
            if (curr.right!=null){
                nodeq.add(curr.right);
                posq.add(pos+1);
                rowq.add(row+1);
            }
        }
    }
}