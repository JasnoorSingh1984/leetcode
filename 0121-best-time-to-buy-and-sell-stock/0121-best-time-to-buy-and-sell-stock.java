class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }

            max=Math.max(max,arr[i]-min);
        }

        return max;
    }
}