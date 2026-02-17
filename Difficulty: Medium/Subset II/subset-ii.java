class Solution {
    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> nums=new ArrayList<>();
        ArrayList<Integer> sub=new ArrayList<>();
        print(arr,0,sub,nums);
        
        
        return nums;
    }
    
    public void print(int[] arr,int idx,ArrayList<Integer> sub,ArrayList<ArrayList<Integer>> nums){
        if (idx==arr.length){
            nums.add(new ArrayList<>(sub));
            return;
        }
        
        sub.add(arr[idx]);
        print(arr,idx+1,sub,nums);
        sub.remove(sub.size()-1);
        
        while (idx+1<arr.length && arr[idx]==arr[idx+1]){
            idx++;
        }
        
        print(arr,idx+1,sub,nums);
    }
}
