class Solution {
    public int singleNonDuplicate(int[] arr) {
        if (arr.length==0){
            return -1;
        }

        if (arr.length==1){
            return arr[0];
        }

        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid=low+(high-low)/2;

            if (mid == 0) {
                if (arr[0] != arr[1]) return arr[0];
            }else if(mid == arr.length - 1) {
                if (arr[mid] != arr[mid - 1]) return arr[mid];
            }else if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }

            int first=mid,last=mid;
            if (arr[mid]==arr[mid-1]){
                first=mid-1;
            }else{
                last=mid+1;
            }

            int left=first-low;
            int right=high-last;

            if (left%2==0){
                low=last+1;
            }else{
                high=first-1;
            }
        }

        return -1;
    }
}