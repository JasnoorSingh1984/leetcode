class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        for (int i=0;i<nums.length;i++){
            int low=0;
            int high=nums[i].length-1;

            while (low<=high){
                int mid=low+(high-low)/2;

                if (nums[i][mid]==target){
                    return true;
                }else if (nums[i][mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }

        return false;
    }
}