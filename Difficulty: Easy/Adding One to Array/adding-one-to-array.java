class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] nums) {
        // code here
        Vector<Integer> arr=new Vector<>();
        for (int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        
        int carry=1;
        for (int i=arr.size()-1;i>=0;i--){
            arr.set(i,arr.get(i)+1);
            
            carry=arr.get(i)/10;
            arr.set(i,arr.get(i)%10);
            
            if (carry==0){
                break;
            }
        }
        
        if (carry==1){
            arr.add(0,1);
        }
        
        return arr;
    }
}