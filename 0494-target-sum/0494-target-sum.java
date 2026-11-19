class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        int n=arr.length;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }

        if (Math.abs(target)>sum || (sum+target)%2!=0) return 0;

        int s1=(sum+target)/2;

        int[][] dp=new int[n][s1+1];

        if (arr[0]==0) dp[0][0]=2;
        else dp[0][0]=1;

        if (arr[0]!=0 && arr[0]<=s1) dp[0][arr[0]]=1;

        for (int i=1;i<n;i++){
            for (int j=0;j<=s1;j++){
                int notpick=dp[i-1][j];
                int pick=0;
                if (arr[i]<=j){
                    pick=dp[i-1][j-arr[i]];
                }

                dp[i][j] = notpick + pick;
            }
        }

        return dp[n-1][s1];
    }
}