class Solution {
    public int numberOfPaths(int m, int n) {
        if (m==1){
            return 1;
        }
        
        int[][] dp=new int[2][n];
        for (int j=0;j<n;j++){
            dp[0][j]=1;
        }
        
        dp[1][0]=1;
        
        for (int i=0;i<m-1;i++){
            
            for (int j=1;j<n;j++){
                dp[1][j]=dp[0][j]+dp[1][j-1];
            }
            
            for (int j=1;j<n;j++){
                dp[0][j]=dp[1][j];
            }
        }
        
        return dp[1][n-1];
    }
}