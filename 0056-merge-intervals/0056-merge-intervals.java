class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> arr=new ArrayList<>(); 

        for (int i=0;i<nums.length;i++){
            int start=nums[i][0];
            int end=nums[i][1];

            int j=i+1;
            while (j<nums.length && nums[j][0]<=end){
                end=Math.max(end,nums[j][1]);
                j++;
            }

            List<Integer> l=new ArrayList<>();
            l.add(start);
            l.add(end);
            arr.add(l);

            i=j-1;            
        }

        int[][] ans=new int[arr.size()][2];

        for (int i=0;i<arr.size();i++){
            ans[i][0]=arr.get(i).get(0);
            ans[i][1]=arr.get(i).get(1);
        }

        return ans;
    }
}