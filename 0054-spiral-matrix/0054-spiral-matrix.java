class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int left=0,right=arr[0].length-1;
        int top=0,bottom=arr.length-1;

        List<Integer> list=new ArrayList<>();


        while (left<=right && top<=bottom){
            for (int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;

            for (int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;

            if (top<=bottom){
                for (int i=right;i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left<=right){
                for (int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}