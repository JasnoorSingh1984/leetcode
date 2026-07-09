class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> nums=new ArrayList<>();
        
        int max=arr[arr.length-1];
        nums.add(max);
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]>=max){
                max=arr[i];
                nums.add(0,max);
            }
        }
        
        return nums;
    }
}
