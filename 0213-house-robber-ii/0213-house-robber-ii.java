class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        dp=new int[nums.length];

        if (nums.length==1){
            return nums[0];
        }

        Arrays.fill(dp,-1);
        int case1=loot(0,nums,nums.length-2);
        
        Arrays.fill(dp,-1);
        int case2=loot(1,nums,nums.length-1);

        return Math.max(case1,case2);
    }

    private int loot(int i,int[] nums,int end){
        if (i>end){
            return 0;
        }

        if (dp[i]!=-1){
            return dp[i];
        }

        int pick=nums[i] + loot(i+2,nums,end);
        int skip=loot(i+1,nums,end);

        return dp[i]=Math.max(pick,skip);
    }
}