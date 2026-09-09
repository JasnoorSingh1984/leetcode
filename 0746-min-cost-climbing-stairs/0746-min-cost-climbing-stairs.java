class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(find(0,cost),find(1,cost));
    }

    public int find(int i,int[] arr){
        if (i>=arr.length){
            return 0;
        }

        if (dp[i]!=-1){
            return dp[i];
        }

        int pick=arr[i] + find(i+1,arr);
        int skip=arr[i] + find(i+2,arr);

        return dp[i]=Math.min(pick,skip);
    }
}