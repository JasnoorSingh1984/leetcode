class Solution {
    public int calculateMinimumHP(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;

        int[][] dp=new int[m][n];
        dp[m-1][n-1]=Math.min(0,arr[m-1][n-1]);

        for (int i=n-2;i>=0;i--){
            dp[m-1][i]=Math.min(0,Math.min(arr[m-1][i],arr[m-1][i]+dp[m-1][i+1]));
        }

        for (int i=m-2;i>=0;i--){
            dp[i][n-1]=Math.min(0,Math.min(arr[i][n-1],arr[i][n-1]+dp[i+1][n-1]));
        }

        for (int i=m-2;i>=0;i--){
            for (int j=n-2;j>=0;j--){
                int best=Math.max(dp[i+1][j],dp[i][j+1]);
                dp[i][j]=Math.min(0,Math.min(arr[i][j],arr[i][j]+best));
            }
        }

        return Math.abs(dp[0][0])+1;
    }
}