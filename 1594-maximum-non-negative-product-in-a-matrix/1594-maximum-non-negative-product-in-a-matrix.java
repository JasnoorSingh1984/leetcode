class Solution {
    public int maxProductPath(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        double mod=Math.pow(10,9)+7;

        double[][] min=new double[m][n];
        double[][] max=new double[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0 && j==0){
                    min[i][j]=grid[i][j];
                    max[i][j]=grid[i][j];
                }else if (i==0){
                    min[i][j]=grid[i][j]*min[i][j-1];
                    max[i][j]=grid[i][j]*max[i][j-1];
                }else if (j==0){
                    min[i][j]=grid[i][j]*min[i-1][j];
                    max[i][j]=grid[i][j]*max[i-1][j];
                }else{
                    double a=grid[i][j]*min[i-1][j];
                    double b=grid[i][j]*min[i][j-1];
                    double c=grid[i][j]*max[i-1][j];
                    double d=grid[i][j]*max[i][j-1];

                    min[i][j]=Math.min(a,Math.min(b,Math.min(c,d)));
                    max[i][j]=Math.max(a,Math.max(b,Math.max(c,d)));
                }
            }
        }

        if (max[m-1][n-1]<0){
            return -1;
        }else{
            return (int) (max[m-1][n-1]%mod);
        }
    }
}