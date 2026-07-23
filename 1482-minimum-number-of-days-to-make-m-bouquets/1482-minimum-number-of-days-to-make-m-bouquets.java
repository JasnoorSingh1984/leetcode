class Solution {
    public boolean get(int[] arr,int day,int m,int k){
        int count=0;
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<=day){
                count++;
            }else{
                max+=count/k;
                count=0;
            }
        }

        max+=count/k;

        if (max>=m){
            return true;
        }else{
            return false;
        }
    }
    public int minDays(int[] arr, int m, int k) {
        if (arr.length < m*k){
            return -1;
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }

        int low=min;
        int high=max;
        int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;

            if (get(arr,mid,m,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }
}