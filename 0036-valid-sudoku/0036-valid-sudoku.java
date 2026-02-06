class Solution {
    public boolean isValidSudoku(char[][] arr) {
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (arr[i][j]=='.'){
                    continue;
                }
                char num=arr[i][j];
                arr[i][j]='.';
                if (!safe(arr,i,j,num)){
                    return false;
                }
                arr[i][j]=num;
            }
        }
        return true;
    }

    public boolean safe(char[][] arr,int row,int cols,int num){
        for (int i=0;i<9;i++){
            if (arr[row][i]==num || arr[i][cols]==num){
                return false;
            }
        }
        int sr=row/3*3;
        int sc=cols/3*3;
        for (int i=sr;i<sr+3;i++){
            for (int j=sc;j<sc+3;j++){
                if (arr[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}