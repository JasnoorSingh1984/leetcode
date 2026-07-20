class Solution {
    public int[][] insert(int[][] nums, int[] arr) {
        List<int[]> list=new ArrayList<>();

        for (int[] num:nums){
            if (num[1]<arr[0]){
                list.add(num);
            }else if (num[0]>arr[1]){
                list.add(arr);
                arr=num;
            }else{
                arr[0]=Math.min(arr[0],num[0]);
                arr[1]=Math.max(arr[1],num[1]);
            }
        }

        list.add(arr);

        return list.toArray(new int[list.size()][]);
    }
}