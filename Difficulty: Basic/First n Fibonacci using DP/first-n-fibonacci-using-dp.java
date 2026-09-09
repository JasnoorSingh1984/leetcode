class Solution {
    ArrayList<Integer> fibonacciNumbers(int n) {
        int mod=1000000007;
        ArrayList<Integer> arr=new ArrayList<>();
        
        arr.add(0);
        if (n>=1){
            arr.add(1);
        }
        
        for (int i=2;i<=n;i++){
            arr.add((arr.get(i-1) + arr.get(i-2))%mod);
        }
        
        return arr;
    }
}