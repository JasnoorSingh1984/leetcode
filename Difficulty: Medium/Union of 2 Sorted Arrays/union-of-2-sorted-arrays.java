class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer> set=new TreeSet<>();
        
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        
        for (int j=0;j<b.length;j++){
            set.add(b[j]);
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        for (int ch:set){
            arr.add(ch);
        }
        
        return arr;
    }
}
