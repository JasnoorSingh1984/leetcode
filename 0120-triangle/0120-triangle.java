class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        int n=arr.size();

        int[][] dp=new int[n][n];

        for (int i=0;i<n;i++){
            dp[n-1][i]=arr.get(n-1).get(i);
        }

        for (int i=n-2;i>=0;i--){
            for (int j=i;j>=0;j--){
                dp[i][j]=Math.min(dp[i+1][j],dp[i+1][j+1]) + arr.get(i).get(j);
            }
        }

        return dp[0][0];
    }
}