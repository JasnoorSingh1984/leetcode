class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;

        while (low<=high){
            int mid=low+(high-low)/2;

            ans=Math.min(ans,nums[mid]);
            if (nums[high]<nums[mid]) low=mid+1;
            else high=mid-1;
        }

        return ans;
    }
}