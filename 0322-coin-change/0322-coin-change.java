class Solution {
    int[][] dp;
    public int coinChange(int[] arr, int n) {
        if (n==0) return 0;

        dp=new int[arr.length][n+1];
        for (int[] nums:dp){
            Arrays.fill(nums,-1);
        }

        int ans=find(arr,arr.length-1,n);
        if (ans>=(int)1e9) return -1;
        else return ans;
    }

    public int find(int[] arr,int idx,int n){
        if (idx==0){
            if (n%arr[0]==0) return n/arr[0];
            else return (int) 1e9;
        }

        if (dp[idx][n]!=-1) return dp[idx][n];

        int notpick=find(arr,idx-1,n);
        int pick=Integer.MAX_VALUE;
        if (arr[idx]<=n){
            pick=1+find(arr,idx,n-arr[idx]);
        }

        return dp[idx][n]=Math.min(pick,notpick);
    }
}