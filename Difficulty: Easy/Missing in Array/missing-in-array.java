class Solution {
    int missingNum(int arr[]) {
        int missing=arr.length+1;
        
        for (int i=0;i<arr.length;i++){
            missing^=arr[i]^(i+1);
        }
        
        return missing;
    }
}