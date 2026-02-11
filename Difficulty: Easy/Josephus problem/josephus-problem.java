class Solution {
    public int josephus(int n, int k) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=1;i<=n;i++){
            arr.add(i);
        }
        
        int i=0;
        while (arr.size()>1){
            i=(i+k-1)%arr.size();
            arr.remove(i);
        }
        
        return arr.get(0);
        
    }
}