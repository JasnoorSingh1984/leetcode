class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;

        int sum=0;
        for (int i=0;i<n;i++){
            sum+=nums[i];
        }

        if (sum%2!=0) return false;

        boolean[][] dp=new boolean[n][sum/2+1];

        int k=sum/2;

        for (int i=0;i<n;i++) dp[i][0]=true;
        if (nums[0]<=k) dp[0][nums[0]]=true;

        for (int i=1;i<n;i++){
            for (int target=1;target<=k;target++){
                boolean notaken=dp[i-1][target];
                boolean taken=false;
                if (nums[i]<=target) taken=dp[i-1][target-nums[i]];
                dp[i][target]=taken || notaken;
            }
        }

        return dp[n-1][k];
    }

}