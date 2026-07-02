class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=arr.length;
        int cols=arr[0].length;

        int low=0;
        int high=row*cols-1;

        while (low<=high){
            int mid=low+(high-low)/2;

            int midRow=mid/cols;
            int midCol=mid%cols;

            if (arr[midRow][midCol]==target){
                return true;
            }else if (arr[midRow][midCol]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return false;
    }
}