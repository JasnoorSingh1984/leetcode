class Solution {
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> arr=new ArrayList<>();

        for (int i=1;i<=row;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            int ans=1;
            for (int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                l.add(ans);
            }
            arr.add(l);
        }

        return arr;
    }
}