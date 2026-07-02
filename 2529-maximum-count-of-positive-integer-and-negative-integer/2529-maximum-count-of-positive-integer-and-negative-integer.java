class Solution {
    public int maximumCount(int[] arr) {
        int low=0;
        int high=arr.length-1;


        while (low<=high){
            int mid=low+(high-low)/2;

            if (arr[mid]>=0){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        int neg=low;

        low=0;
        high=arr.length-1;

        while (low<=high){
            int mid=low+(high-low)/2;

            if (arr[mid]<=0){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        int pos=arr.length-low;

        return Math.max(neg,pos);
    }
}