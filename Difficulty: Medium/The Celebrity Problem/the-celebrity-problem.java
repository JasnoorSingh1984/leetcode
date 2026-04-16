class Solution {
    public int celebrity(int arr[][]) {
        int n=arr.length;
        for (int cols=0;cols<n;cols++){
            boolean found=true;
            for (int i=0;i<n;i++){
                if (i!=cols && arr[i][cols]==0){
                    found=false;
                    break;
                }
            }
            
            if (found){
                for (int i=0;i<n;i++){
                    if (i!=cols && arr[cols][i]==1){
                        found=false;
                        break;
                    }
                }
            }
            
            if (found){
                return cols;
            }
        }
        return -1;
    }
}