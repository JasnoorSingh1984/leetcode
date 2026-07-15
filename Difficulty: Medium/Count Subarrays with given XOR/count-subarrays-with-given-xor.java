class Solution {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        
        long count=0;
        int sum=0;
        
        for (int i=0;i<arr.length;i++){
            sum^=arr[i];
            int x=sum^k;
            
            if (map.containsKey(x)){
                int freq=map.get(x);
                count+=freq;
            }
            
            if (map.containsKey(sum)){
                int freq=map.get(sum);
                map.put(sum,freq+1);
            }else{
                map.put(sum,1);
            }
        }
        
        return count;
    }
}