class Solution {
    public int minimumOperations(TreeNode root) {
        if (root == null) return 0;

        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int[] arr = new int[size];
            int[] sorted = new int[size];

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                arr[i] = curr.val;
                sorted[i] = curr.val;

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            Arrays.sort(sorted);

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < size; i++) {
                map.put(arr[i], i);
            }

            for (int i = 0; i < size; i++) {
                if (arr[i] != sorted[i]) {
                    ans++;

                    int correctIndex = map.get(sorted[i]);
                    map.put(arr[i], correctIndex);
                    map.put(sorted[i], i);

                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }
            }
        }

        return ans;
    }
}
