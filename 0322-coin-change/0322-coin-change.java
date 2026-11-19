class Solution {
    
    public int coinChange(int[] arr, int n) {
        if (n==0) return 0;

        int[][] dp=new int[arr.length][n+1];

        for (int i=0;i<=n;i++){
            if (i%arr[0]==0) dp[0][i]=i/arr[0];
            else dp[0][i]=(int)1e9;
        }

        for (int i=1;i<arr.length;i++){
            for (int j=0;j<=n;j++){
                int notpick=dp[i-1][j];
                int pick=Integer.MAX_VALUE;
                if (arr[i]<=j){
                    pick=1+dp[i][j-arr[i]];
                }

                dp[i][j]=Math.min(notpick,pick);
            }
        }

        if (dp[arr.length-1][n]==(int)1e9) return -1;
        else return dp[arr.length-1][n];

    }

    // public int find(int[] arr,int idx,int n){
    //     if (idx==0){
    //         if (n%arr[0]==0) return n/arr[0];
    //         else return (int) 1e9;
    //     }

    //     if (dp[idx][n]!=-1) return dp[idx][n];

    //     int notpick=find(arr,idx-1,n);
    //     int pick=Integer.MAX_VALUE;
    //     if (arr[idx]<=n){
    //         pick=1+find(arr,idx,n-arr[idx]);
    //     }

    //     return dp[idx][n]=Math.min(pick,notpick);
    // }
}