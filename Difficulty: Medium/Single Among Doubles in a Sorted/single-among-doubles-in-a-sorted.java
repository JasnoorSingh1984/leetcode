class Solution {
    int single(int[] arr) {
        if (arr.length==1){
            return arr[0];
        }
        
        if (arr[0]!=arr[1]){
            return arr[0];
        }
        
        if (arr[arr.length-1]!=arr[arr.length-2]){
            return arr[arr.length-1];
        }
        
        int low=0;
        int high=arr.length-1;
        
        while (low<=high){
            int mid=low+(high-low)/2;
            
            if (arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }else{
                int first=mid,last=mid;
                
                if (arr[mid]==arr[mid-1]){
                    first=mid-1;
                }else{
                    last=mid+1;
                }
                
                int left=first-low;
                int right=high-last;
                
                if (left%2!=0){
                    high=first-1;
                }else{
                    low=last+1;
                }
            }
        }
        
        return -1;
    }
}