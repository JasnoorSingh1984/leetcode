class Solution {
    public boolean get(int[] arr,int cap,int days){
        int day=1,load=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]+load>cap){
                day=day+1;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }

        if (day<=days){
            return true;
        }else{
            return false;
        }

    }
    public int shipWithinDays(int[] arr, int days) {
        int sum=0;
        int max=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (arr[i]>max){
                max=arr[i];
            }
        }

        int low=max;
        int high=sum;
        int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;

            if (get(arr,mid,days)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }
}