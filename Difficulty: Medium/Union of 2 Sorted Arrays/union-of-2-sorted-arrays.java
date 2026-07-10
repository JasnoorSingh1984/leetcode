class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer> set=new TreeSet<>();
        
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        
        for (int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        for (int ch:set){
            arr.add(ch);
        }
        
        return arr;
    }
}
