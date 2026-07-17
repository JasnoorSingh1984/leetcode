class Solution {
    public int trap(int[] nums) {
        int total=0;
        int lmax=0;
        int rmax=0;

        int left=0;
        int right=nums.length-1;
        while (left<right){
            lmax=Math.max(lmax,nums[left]);
            rmax=Math.max(rmax,nums[right]);

            if (lmax<=rmax){
                total+=lmax-nums[left];
                left++;
            }else{
                total+=rmax-nums[right];
                right--;
            }
        }

        return total;
    }
}