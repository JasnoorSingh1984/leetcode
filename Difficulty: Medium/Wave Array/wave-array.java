class Solution {
    public void sortInWave(int arr[]) {
        // code here
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            i++;
        }
    }
}
