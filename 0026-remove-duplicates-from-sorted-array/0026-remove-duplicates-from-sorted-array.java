class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        int j=0;

        while (j<arr.length){
            if (arr[i]==arr[j]){
                j++;
            }else{
                arr[i+1]=arr[j];
                i++;
                j++;
            }
        }

        return i+1;
    }
}