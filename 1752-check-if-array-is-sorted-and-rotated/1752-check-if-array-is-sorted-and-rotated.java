class Solution {
    public boolean check(int[] arr) {
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                count++;
            }

            if (count>1){
                return false;
            }
        }

        if (arr[arr.length-1]>arr[0]){
            count++;
        }

        return count<=1;
    }
}