class Solution {
    public int change(int amt, int[] arr) {
        int[][] dp=new int[arr.length][amt+1];

        for (int i=0;i<=amt;i++){
            if (i%arr[0]==0) dp[0][i]=1;
        }

        for (int i=1;i<arr.length;i++){
            for (int j=0;j<=amt;j++){
                int notpick=dp[i-1][j];
                int pick=0;
                if (arr[i]<=j){
                    pick=dp[i][j-arr[i]];
                }

                dp[i][j]=pick+notpick;
            }
        }

        return dp[arr.length-1][amt];
    }

}