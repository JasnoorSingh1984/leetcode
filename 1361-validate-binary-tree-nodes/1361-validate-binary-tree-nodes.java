class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            int node=i;
            int left=leftChild[i];
            int right=rightChild[i];
            if (left!=-1){
                if (map.containsKey(left)) return false;
                map.put(left,i);
            }
            if (right!=-1){
                if (map.containsKey(right)) return false;
                map.put(right,i);
            }
        }

        int root=-1;
        for (int i=0;i<n;i++){
            if (!map.containsKey(i)){
                if (root!=-1) return false;
                root=i;
            }
        }

        if (root==-1) return false;

        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        q.add(root);
        set.add(root);
        int count=0;
        while (!q.isEmpty()){
            int node=q.remove();
            count++;
            if (leftChild[node]!=-1){
                q.add(leftChild[node]);
                set.add(leftChild[node]);
            }
            if (rightChild[node]!=-1){
                q.add(rightChild[node]);
                set.add(rightChild[node]);
            }
        }

        if (count!=n) return false;

        return true;
    }
}