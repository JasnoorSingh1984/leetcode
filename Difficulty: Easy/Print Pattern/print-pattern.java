class Solution {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        print(n,arr);
        return arr;
    }
    
    public void print(int n,ArrayList<Integer> arr){
        arr.add(n);
        
        if (n<=0){
            return;
        }
        
        print(n-5,arr);
        
        arr.add(n);
    }
}