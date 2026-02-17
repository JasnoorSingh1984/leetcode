class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        print(k,n,1,sub,arr);
        return arr;
    }

    public void print(int k,int n,int idx,List<Integer> sub,List<List<Integer>> arr){
        if (k==0 && n==0){
            arr.add(new ArrayList<>(sub));
            return;
        }

        if (k==0 && n!=0){
            return;
        }

        for (int i=idx;i<=9;i++){
            sub.add(i);
            print(k-1,n-i,i+1,sub,arr);
            sub.remove(sub.size()-1);
        }
    }
}