class Solution {
    int single(int[] arr) {
        int num=arr[0];
        for (int i=1;i<arr.length;i++){
            num^=arr[i];
        }
        return num;
    }
}