class Solution {
    public int maximumUnits(int[][] arr, int size) {
        Arrays.sort(arr,(a,b) -> Integer.compare(b[1],a[1]));

        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i][0]<=size){
                count+=arr[i][0]*arr[i][1];
                size-=arr[i][0];
            }else{
                count+=size*arr[i][1];
                break;
            }
        }

        return count;
    }
}