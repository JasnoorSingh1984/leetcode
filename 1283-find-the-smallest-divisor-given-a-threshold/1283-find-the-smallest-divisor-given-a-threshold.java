class Solution {
    public boolean get(int[] arr,int div,int threshold){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            int ans=(int)Math.ceil((double) arr[i]/div);
            sum+=ans;
        }

        if (sum<=threshold){
            return true;
        }else{
            return false;
        }
    }
    
    public int smallestDivisor(int[] arr, int threshold) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }

        int low=1;
        int high=max;
        int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;

            if (get(arr,mid,threshold)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }
}