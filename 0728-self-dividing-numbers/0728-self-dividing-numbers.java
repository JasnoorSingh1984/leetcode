class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for (int i=left;i<=right;i++){
            if (sumof(i)){
                arr.add(i);
            }
        }

        return arr;
    }

    public boolean sumof(int n){
        int num=n;
        while (num!=0){
            int digit=num%10;
            if ((digit!=0 && n%digit!=0) || (digit==0)) return false;
            num/=10;
        }

        return true;
    }
}