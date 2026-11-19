class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        int n=arr.length;
        return find(arr,n-1,target);
    }

    public int find(int[] arr,int idx,int target){
        if (idx==0){
            int way=0;
            if (arr[0]==target) way++;
            if (-arr[0]==target) way++;
            return way;
        }

        int pos=find(arr,idx-1,target+arr[idx]);
        int neg=find(arr,idx-1,target-arr[idx]);

        return pos+neg;
    }
}