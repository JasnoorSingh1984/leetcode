class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int min=arr[0];

        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]-min);
            min=Math.min(min,arr[i]);
        }
        
        return max;
    }
}