class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        long sum=n*(n+1)/2;
        long arraysum=0;
        for (int i=0;i<n;i++){
            arraysum+=nums[i];
        }

        return (int)(sum-arraysum);
    }
}