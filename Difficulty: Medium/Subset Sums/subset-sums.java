// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        print(arr,0,0,ans);
        return ans;
    }
    
    public void print(int[] arr,int idx,int sum,ArrayList<Integer> ans){
        if (idx==arr.length){
            ans.add(sum);
            return;
        }
        
        print(arr,idx+1,sum+arr[idx],ans);
        print(arr,idx+1,sum,ans);
    }
}