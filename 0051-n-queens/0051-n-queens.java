class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }

        List<List<String>> ans=new ArrayList<>();
        print(arr,0,ans);
        return ans;
    }

    public void print(char[][] arr,int rows,List<List<String>> ans){
        int n=arr.length;

        if (rows==n){
            List<String> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                String str="";
                for (int j=0;j<n;j++){
                    str+=arr[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;
        }

        for (int i=0;i<n;i++){
            if (safe(arr,rows,i)){
                arr[rows][i]='Q';
                print(arr,rows+1,ans);
                arr[rows][i]='.';
            }
        }
    }

    public boolean safe(char[][] arr,int row,int cols){
        int n=arr.length;

        for (int i=0;i<n;i++){
            if (arr[row][i]=='Q' || arr[i][cols]=='Q'){
                return false;
            }
        }

        int i=row;
        int j=cols;
        while (i>=0 && j<n){
            if (arr[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }

        i=row;
        j=cols;
        while (i<n && j<n){
            if (arr[i][j]=='Q'){
                return false;
            }
            i++;
            j++;
        }

        i=row;
        j=cols;
        while (i<n && j>=0){
            if (arr[i][j]=='Q'){
                return false;
            }
            i++;
            j--;
        }

        i=row;
        j=cols;
        while (i>=0 && j>=0){
            if (arr[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }

        return true;
    }
}