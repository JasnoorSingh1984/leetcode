class Solution {
    int countFreq(int[] arr, int target) {
        int first=-1;
        int low=0;
        int high=arr.length-1;
        
        while (low<=high){
            int mid=low+(high-low)/2;
            
            if (arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if (arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        int last=-1;
        low=0;
        high=arr.length-1;
        
        while (low<=high){
            int mid=low+(high-low)/2;
            
            if (arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if (arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        if (first==-1 && last==-1){
            return 0;
        }else{
            return last-first+1;
        }
    }
}
