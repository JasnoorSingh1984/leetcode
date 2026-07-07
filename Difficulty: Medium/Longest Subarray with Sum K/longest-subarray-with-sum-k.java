class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if (sum==k){
                max=Math.max(max,i+1);
            }else{
                int rem=sum-k;
                if (map.containsKey(rem)){
                    max=Math.max(max,i-map.get(rem));
                }
            }
            
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        
        return max;
    }
}
