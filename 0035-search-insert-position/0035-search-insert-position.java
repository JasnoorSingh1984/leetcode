class Solution {
    public int searchInsert(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int idx=-1;

        while (low<=high){
            int mid=low+(high-low)/2;

            if (arr[mid]==target){
                idx=mid;
                high=mid-1;
            }else if (arr[mid]>target){
                idx=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        if (idx==-1){
            return arr.length;
        }else{
            return idx;
        }
    }
}