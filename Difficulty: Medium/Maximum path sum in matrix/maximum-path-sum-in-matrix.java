class Solution {
    public int maximumPath(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        if (n == 1) {
            int sum = 0;

            for (int i = 0; i < m; i++){
                sum += grid[i][0];
            }
            return sum;
        }
        
        
        int[][] dp=new int[m][n];
        
        for (int j=0;j<n;j++){
            dp[0][j]=grid[0][j];
        }
        
        for (int i=1;i<m;i++){
            for (int j=0;j<n;j++){
                if (j==0){
                    dp[i][j]=grid[i][j] + Math.max(dp[i-1][j],dp[i-1][j+1]);
                }else if (j==n-1){
                    dp[i][j]=grid[i][j] + Math.max(dp[i-1][j],dp[i-1][j-1]);
                }else{
                    dp[i][j]=grid[i][j] + Math.max(dp[i-1][j],Math.max(dp[i-1][j-1],dp[i-1][j+1]));
                }
            }
        }
        
        int max=0;
        for (int j=0;j<n;j++){
            if (dp[m-1][j]>max){
                max=dp[m-1][j];
            }
        }
        
        return max;
    }
}