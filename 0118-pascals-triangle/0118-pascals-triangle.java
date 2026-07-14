class Solution {
    public int ncr(int r,int c){
        int res=1;
        for (int i=0;i<c;i++){
            res=res*(r-i);
            res=res/(i+1);
        }

        return res;
    }

    public List<List<Integer>> generate(int row) {
        List<List<Integer>> arr=new ArrayList<>();

        for (int i=1;i<=row;i++){
            List<Integer> l=new ArrayList<>();
            for (int j=0;j<i;j++){
                int res=ncr(i-1,j);
                l.add(res);
            }
            arr.add(l);
        }

        return arr;
    }
}