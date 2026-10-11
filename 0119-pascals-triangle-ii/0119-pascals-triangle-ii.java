class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> arr=new ArrayList<>();
        n=n+1;
        long num=1;
        for (int j=0;j<n;j++){
            arr.add((int)num);
            num=num*(n-1-j)/(j+1);
        }

        return arr;
    }
}