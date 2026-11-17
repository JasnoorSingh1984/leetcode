class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        find(k,n,1,arr,l);
        return arr;
    }

    public void find(int n,int k,int idx,List<List<Integer>> arr,List<Integer> l){
        if (n==0){
            if (k==0){
                arr.add(new ArrayList<>(l));
            }
            return;
        }

        for (int i=idx;i<=9;i++){
            if (i>k) break;

            l.add(i);
            k-=i;
            find(n-1,k,i+1,arr,l);
            l.remove(l.size()-1);
            k+=i;
        }
    }
}