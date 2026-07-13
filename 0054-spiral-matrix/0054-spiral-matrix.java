class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int left=0,right=arr[0].length-1;
        int top=0,bottom=arr.length-1;

        ArrayList<Integer> nums=new ArrayList<>();
        while (top<=bottom && left<=right){
            for (int i=left;i<=right;i++){
                nums.add(arr[top][i]);
            }
            top++;

            for (int i=top;i<=bottom;i++){
                nums.add(arr[i][right]);
            }
            right--;

            if (top<=bottom){
                for (int i=right;i>=left;i--){
                    nums.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left<=right){
                for (int i=bottom;i>=top;i--){
                    nums.add(arr[i][left]);
                }
                left++;
            }
        }

        return nums;
    }
}