class Solution {
    public void solveSudoku(char[][] arr) {
        char[][] grid=new char[9][9];
        solve(arr,0,0,grid);
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                arr[i][j]=grid[i][j];
            }
        }
    }

    public void solve(char[][] arr,int row,int cols,char[][] grid){
        if (row==9){
            for (int i=0;i<9;i++){
                for (int j=0;j<9;j++){
                    grid[i][j]=arr[i][j];
                }
            }
            return;
        }else if (arr[row][cols]!='.'){
            if (cols<8){
                solve(arr,row,cols+1,grid);
            }else{
                solve(arr,row+1,0,grid);
            }
        }else{
            for (char ch='1';ch<='9';ch++){
                if (safe(arr,row,cols,ch)){
                    arr[row][cols]=ch;
                    if (cols<8){
                        solve(arr,row,cols+1,grid);
                    }else{
                        solve(arr,row+1,0,grid);
                    }
                    arr[row][cols]='.';
                }
            }
        }
    }

    public boolean safe(char[][] arr,int row,int cols,char ch){
        for (int i=0;i<9;i++){
            if (arr[i][cols]==ch || arr[row][i]==ch){
                return false;
            }
        }

        int sr=row/3*3;
        int sc=cols/3*3;
        for (int i=sr;i<sr+3;i++){
            for (int j=sc;j<sc+3;j++){
                if (arr[i][j]==ch){
                    return false;
                }
            }
        }

        return true;
    }
}