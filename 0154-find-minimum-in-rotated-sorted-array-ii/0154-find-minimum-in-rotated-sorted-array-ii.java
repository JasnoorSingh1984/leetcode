class Solution {
    public int findMin(int[] arr) {
        int low=0;
        int high=arr.length-1;

        while (low<high){
            int mid=low+(high-low)/2;

            if (arr[high]<arr[mid]){
                low=mid+1;
            }else if (arr[high]<arr[mid]){
                high=mid;
            }else{
                high--;
            }
        }

        return arr[low];
    }
}