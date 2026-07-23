class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row=0;
        int cols=nums[0].length-1;

        while (row<nums.length && cols>=0){
            if (nums[row][cols]==target){
                return true;
            }else if (nums[row][cols]<target){
                row++;
            }else{
                cols--;
            }
        }

        return false;        
    }
}