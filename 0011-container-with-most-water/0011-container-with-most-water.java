class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;

        int max=-1;

        while (left<right){
            int width=right-left;
            int area=Math.min(arr[left],arr[right])*width;

            max=Math.max(max,area);

            if (arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }

        return max;
    }
}