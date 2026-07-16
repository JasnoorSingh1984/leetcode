class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        int left=0;
        int right=nums.length-1;

        while (left<right){
            int min=Math.min(nums[left],nums[right]);
            max=Math.max(max,min*(right-left));

            if (nums[left]<nums[right]){
                left++;
            }else{
                right--;
            }
        }

        return max;
    }
}