class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (map1.containsKey(a[i])){
                int freq=map1.get(a[i]);
                map1.put(a[i],freq+1);
            }else{
                map1.put(a[i],1);
            }
        }
        
        HashMap<Integer,Integer> map2=new HashMap<>();
        for (int i=0;i<b.length;i++){
            if (!map1.containsKey(b[i])){
                return false;
            }
            if (map2.containsKey(b[i])){
                int freq=map2.get(b[i]);
                map2.put(b[i],freq+1);
            }else{
                map2.put(b[i],1);
            }
        }
        
        for (int ele: map2.keySet()){
            int freq1=map1.get(ele);
            int freq2=map2.get(ele);
            if (freq1<freq2){
                return false;
            }
        }
        
        return true;
    }
}
