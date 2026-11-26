class Solution {
    public void find(String s1,String s2,int[][] dp){
        for (int i=1;i<s1.length()+1;i++){
            for (int j=1;j<s2.length()+1;j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
    }

    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();

        int[][] dp=new int[s.length()+1][s.length()+1];

        find(s,sb.toString(),dp);

        return s.length()-dp[s.length()][s.length()];
    }
}