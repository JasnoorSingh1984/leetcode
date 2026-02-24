// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        int n=arr[0];
        for (int i=1;i<arr.length;i++){
            n=n^arr[i];
        }
        return n;
    }
}