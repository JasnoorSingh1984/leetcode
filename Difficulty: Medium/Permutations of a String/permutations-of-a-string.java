class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        Set<String> set=new HashSet<>();
        ArrayList<String> arr=new ArrayList<>();
        
        print(s,"",set);
        
        ArrayList<String> ans=new ArrayList<>(set);
        Collections.sort(ans);
        
        return ans;
    }
    
    public void print(String str,String s,Set<String> arr){
        if (str.equals("")){
            arr.add(s);
            return;
        }
        
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String reminder=left+right;
            print(reminder,s+ch,arr);
        }
    }
}