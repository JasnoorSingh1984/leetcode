class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low=0;
        int high=k-1;
        int max=0;
        
        for (int i=0;i<k;i++){
            max+=arr[i];
        }
        
        int sum=max;
        while (high<arr.length-1){
            sum-=arr[low];
            low++;
            high++;
            sum+=arr[high];
            
            max=Math.max(max,sum);
        }
        
        return max;
    }
}