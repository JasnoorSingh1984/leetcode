class Solution {
    public int maxGold(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        if (m==1){
            int sum=0;
            for (int i=0;i<n;i++){
                sum+=grid[0][i];
            }
            return sum;
        }
        
        int[][] dp=new int[m][n];
        
        for (int j=0;j<m;j++){
            dp[j][0]=grid[j][0];
        }
        
        for (int j=1;j<n;j++){
            for (int i=0;i<m;i++){
                if (i==0){
                    dp[i][j]=grid[i][j] + Math.max(dp[i][j-1],dp[i+1][j-1]);
                }else if (i==m-1){
                    dp[i][j]=grid[i][j] + Math.max(dp[i][j-1],dp[i-1][j-1]);
                }else{
                    dp[i][j]=grid[i][j] + Math.max(dp[i][j-1],Math.max(dp[i+1][j-1],dp[i-1][j-1]));
                }
            }
        }
        
        int max=0;
        for (int i=0;i<m;i++){
            if (dp[i][n-1]>max){
                max=dp[i][n-1];
            }
        }
        
        return max;
    }
}