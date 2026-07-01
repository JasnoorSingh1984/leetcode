class Solution {
    public int findFloor(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;
        int idx=-1;
        
        while (low<=high){
            int mid=low+(high-low)/2;
            
            if (arr[mid]==x){
                idx=mid;
                low=mid+1;
            }else if (arr[mid]>x){
                high=mid-1;
            }else{
                idx=mid;
                low=mid+1;
            }
        }
        
        return idx;
    }
}
