class Solution {
    public void setrow(int[][] arr,int i){
        for (int j=0;j<arr[0].length;j++){
            if (arr[i][j]!=0){
                arr[i][j]=-10;
            }
        }
    }

    public void setcol(int[][] arr,int j){
        for (int i=0;i<arr.length;i++){
            if (arr[i][j]!=0){
                arr[i][j]=-10;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j]==0){
                    setrow(matrix,i);
                    setcol(matrix,j);
                }
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j]==-10){
                    matrix[i][j]=0;
                }
            }
        }
    }
}