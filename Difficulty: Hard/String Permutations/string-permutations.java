// User function Template for Java

class Solution {
    public ArrayList<String> permutation(String s) {
        // Your code here
        ArrayList<String> arr=new ArrayList<>();
        char[] nums=s.toCharArray();
        print(nums,0,arr);
        
        Collections.sort(arr);
        return arr;
    }
    
    public void print(char[] nums,int idx,ArrayList<String> arr){
        if (idx==nums.length){
            arr.add(new String(nums));
            return;
        }
        
        for (int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            print(nums,idx+1,arr);
            swap(nums,idx,i);
        }
    }
    
    public void swap(char[] nums,int idx,int i){
        char temp=nums[idx];
        nums[idx]=nums[i];
        nums[i]=temp;
    }
}
