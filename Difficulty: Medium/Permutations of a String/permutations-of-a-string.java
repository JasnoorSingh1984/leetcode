class Solution {
    public ArrayList<String> findPermutation(String s) {
        char[] nums=s.toCharArray();
        ArrayList<String> arr=new ArrayList<>();
        subs(nums,0,arr);
        Collections.sort(arr);
        return arr;
    }
    
    public void subs(char[] nums,int idx,ArrayList<String> arr){
        if (idx==nums.length){
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<nums.length;i++){
                sb.append(nums[i]);
            }
            arr.add(sb.toString());
            return;
        }
        
        HashSet<Character> set=new HashSet<>();
        for (int i=idx;i<nums.length;i++){
            if (set.contains(nums[i])){
                continue;
            }
            
            set.add(nums[i]);
            swap(nums,i,idx);
            subs(nums,idx+1,arr);
            swap(nums,i,idx);
        }
    }
    
    public void swap(char[] nums,int i,int idx){
        char temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}