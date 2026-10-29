class Solution {
    int[][] dp;
    public int find(int i,int buy,int[] arr){
        if (i==arr.length) return 0;

        if (dp[i][buy]!=-1) return dp[i][buy];

        int profit=0;
        if (buy==1){
            profit=Math.max(find(i+1,0,arr)-arr[i],find(i+1,1,arr));
        }else{
            profit=Math.max(find(i+1,1,arr)+arr[i],find(i+1,0,arr));
        }

        return dp[i][buy]=profit;
    }

    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];

        for (int[] num:dp){
            Arrays.fill(num,-1);
        }

        return find(0,1,prices);
    }
}