class Solution {
    public int[] twoSum(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;

        while (low<high){
            int tar=arr[low]+arr[high];

            if (tar==target){
                return new int[]{low+1,high+1};
            }else if (tar<target){
                low++;
            }else{
                high--;
            }
        }

        return new int[]{};
    }
}