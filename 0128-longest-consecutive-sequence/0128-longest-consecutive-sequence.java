class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lastsmall=Integer.MIN_VALUE;
        int count=0;
        int max=0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]-1==lastsmall){
                count++;
                lastsmall=nums[i];
            }else if(nums[i]!=lastsmall){
                count=1;
                lastsmall=nums[i];
            }
            max=Math.max(max,count);
        }

        return max;
    }
}