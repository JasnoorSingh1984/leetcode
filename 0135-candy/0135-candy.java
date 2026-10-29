class Solution {
    public int candy(int[] arr) {
        int[] left=new int[arr.length];
        Arrays.fill(left,1);
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[i-1]){
                left[i]=left[i-1]+1;
            }
        }

        int[] right=new int[arr.length];
        Arrays.fill(right,1);
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]>arr[i+1]){
                right[i]=right[i+1]+1;
            }
        }

        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=Math.max(left[i],right[i]);
        }

        return sum;
    }
}