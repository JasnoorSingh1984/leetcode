class Solution {
    public int findMaxSum(int arr[]) {
        int[] dp=new int[3];
        dp[0]=arr[0];
        if (arr.length==1){
            return arr[0];
        }
        
        if (arr.length==2){
            return Math.max(arr[0],arr[1]);
        }
        
        if (arr.length>1){
            dp[1]=Math.max(arr[0],arr[1]);
        }
        
        for (int i=2;i<arr.length;i++){
            dp[2]=Math.max(dp[1],arr[i]+dp[0]);
            dp[0]=dp[1];
            dp[1]=dp[2];
        }
        
        return dp[2];
    }
}