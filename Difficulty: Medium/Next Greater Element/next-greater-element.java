class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> nums=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        
        for (int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            
            if (st.isEmpty()){
                nums.add(-1);
            }else{
                nums.add(st.peek());
            }
            
            st.push(curr);
        }
        
        Collections.reverse(nums);
        
        return nums;
    }
    
    
}