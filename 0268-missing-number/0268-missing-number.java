class Solution {
    public int missingNumber(int[] nums) {
        int miss=nums.length;

        for (int i=0;i<nums.length;i++){
            miss^=nums[i]^i;
        }

        return miss;
    }
}