class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int max=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }

        int low=1;
        int high=max;
        int ans=0;

        while (low<=high){
            int mid=low+(high-low)/2;
            long hour=find(nums,mid);

            if (hour<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }

    public long find(int[] nums,int h){
        long sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=(long)Math.ceil((double)nums[i]/h);
        }
        return sum;
    }
}