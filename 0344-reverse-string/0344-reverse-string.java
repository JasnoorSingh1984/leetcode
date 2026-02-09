class Solution {
    public void reverse(char[] arr,int start,int end){
        if (start>=end){
            return;
        }

        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverse(arr,start+1,end-1);
    }
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
}