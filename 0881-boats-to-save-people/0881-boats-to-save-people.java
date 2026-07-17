class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);

        int left=0;
        int right=nums.length-1;

        int boats=0;

        while (left<=right){
            int sum=nums[left]+nums[right];

            if (sum<=limit){
                left++;
            }
            right--;
            boats++;
        }

        return boats;
    }
}