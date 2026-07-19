class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }

    public int atmost(int[] nums,int k){
        int count=0;
        int sum=0;
        int odd=0;
        
        int left=0;
        int right=0;

        while (right<nums.length){
            sum+=nums[right];

            if (nums[right]%2!=0){
                odd++;
            }

            while (odd>k){
                sum-=nums[left];
                if (nums[left]%2!=0){
                    odd--;
                }
                left++;
            }

            count+=right-left+1;
            right++;
        }

        return count;
    }
}