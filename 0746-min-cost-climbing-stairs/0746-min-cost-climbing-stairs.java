class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];

        dp[0]=arr[0];
        if (n>1) dp[1]=arr[1];

        for (int i=2;i<n;i++){
            dp[i]=Math.min(arr[i]+dp[i-1],arr[i]+dp[i-2]);
        }

        return Math.min(dp[n-1],dp[n-2]);
    }

}