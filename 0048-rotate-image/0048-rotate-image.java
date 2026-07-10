class Solution {
    public void rotate(int[][] nums) {
        int n=nums.length;

        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[j][n-i-1]=nums[i][j];
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                nums[i][j]=arr[i][j];
            }
        }
    }
}