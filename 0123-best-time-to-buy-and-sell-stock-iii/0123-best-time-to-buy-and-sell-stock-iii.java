class Solution {
    int[][][] dp;
    public int find(int i,int buy,int count,int[] arr){
        if (i==arr.length) return 0;
        if (count==2) return 0;

        if (dp[i][buy][count]!=-1) return dp[i][buy][count];

        int profit=0;
        if (buy==1){
            profit=Math.max(find(i+1,0,count,arr)-arr[i],find(i+1,1,count,arr));
        }else{
            profit=Math.max(find(i+1,1,count+1,arr)+arr[i],find(i+1,0,count,arr));
        }

        return dp[i][buy][count]=profit;
    }

    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2][2];

        for (int[][] arr:dp){
            for (int[] num:arr){
                Arrays.fill(num,-1);
            }
        }

        return find(0,1,0,prices);
    }
}