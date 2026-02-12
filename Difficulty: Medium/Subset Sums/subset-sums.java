// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> nums=new ArrayList<>();
        print(arr,0,0,nums);
        return nums;
    }
    
    public void print(int[] arr,int idx,int sum,ArrayList<Integer> nums){
        if (idx==arr.length){
            nums.add(sum);
            return;
        }
        
        print(arr,idx+1,sum+arr[idx],nums);
        print(arr,idx+1,sum,nums);
    }
}