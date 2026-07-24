class Solution {
    public int trap(int[] nums) {
        int sum=0;
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;

        int left=0;
        int right=nums.length-1;
        while (left<right){
            lmax=Math.max(lmax,nums[left]);
            rmax=Math.max(rmax,nums[right]);

            if (lmax<rmax){
                sum+=lmax-nums[left];
                left++;
            }else{
                sum+=rmax-nums[right];
                right--;
            }
        }

        return sum;
    }
}