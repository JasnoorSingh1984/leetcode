class Solution {
    public int maxProfit(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]<min){
                min=nums[i];
            }

            max=Math.max(max,nums[i]-min);
        }

        return max;
    }
}