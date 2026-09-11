class Solution {
    public int countSquares(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (grid[i][j]>0){
                    if (grid[i][j-1]>0 && grid[i-1][j-1]>0 && grid[i-1][j]>0){
                        grid[i][j]=Math.min(grid[i][j-1],Math.min(grid[i-1][j-1],grid[i-1][j])) + 1;
                    }
                }
            }
        }
        
        int sum=0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                sum+=grid[i][j];
            }
        }
        
        return sum;
    }
}