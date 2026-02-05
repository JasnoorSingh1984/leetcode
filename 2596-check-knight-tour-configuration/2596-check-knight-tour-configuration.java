class Solution {
    public boolean checkValidGrid(int[][] arr) {
        if (arr[0][0]!=0){
            return false;
        }

        return print(arr,0,0,0);
    }

    public boolean print(int[][] arr,int rows,int cols,int num){
        int n=arr.length;

        if (num==n*n-1){
            return true;
        }

        int i=rows-2;
        int j=cols-1;
        if (i>=0 && j>=0 && arr[i][j]==num+1){
            return print(arr,i,j,num+1);
        }

        i=rows-2;
        j=cols+1;
        if (i>=0 && j<n && arr[i][j]==num+1){
            return print(arr,i,j,num+1);
        }

        i=rows-1;
        j=cols+2;
        if (i>=0 && j<n && arr[i][j]==num+1){
            return print(arr,i,j,num+1);
        }

        i=rows+1;
        j=cols+2;
        if (i<n && j<n && arr[i][j]==num+1){
            return print(arr,i,j,num+1);
        }

        i=rows+2;
        j=cols+1;
        if (i<n && j<n && arr[i][j]==num+1){
            return print(arr,i,j,num+1);
        }

        i=rows+2;
        j=cols-1;
        if (i<n && j>=0 && arr[i][j]==num+1){
            return print(arr,i,j,num+1);
        }

        i=rows+1;
        j=cols-2;
        if (i<n && j>=0 && arr[i][j]==num+1){
            return print(arr,i,j,num+1);
        }

        i=rows-1;
        j=cols-2;
        if (i>=0 && j>=0 && arr[i][j]==num+1){
            return print(arr,i,j,num+1);
        }

        return false;
    }
}