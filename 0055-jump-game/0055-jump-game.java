class Solution {
    public boolean canJump(int[] nums) {
        int l=0;
        int r=0;

        while (r<nums.length-1){
            int far=r;
            for (int i=l;i<=r;i++){
                far=Math.max(far,i+nums[i]);
            }

            if (far==r) return false;

            l=r+1;
            r=far;
        }

        return true;
    }
}