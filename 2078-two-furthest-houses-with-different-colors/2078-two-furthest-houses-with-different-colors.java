class Solution {
    public int maxDistance(int[] nums) {
        int leftmax=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[0]){
                leftmax=i;
            }
        }

        int rightmax=0;
        for (int i=nums.length-2;i>=0;i--){
            if (nums[i]!=nums[nums.length-1]){
                rightmax=nums.length-1-i;
            }
        }

        return Math.max(leftmax,rightmax);
    }
}