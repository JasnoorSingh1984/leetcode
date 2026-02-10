class Solution {
    public ArrayList<String> powerSet(String s) {
        // code here
        ArrayList<String> arr=new ArrayList<>();
        print(s,0,"",arr);
        return arr;
    }
    
    public void print(String s,int idx,String str,ArrayList<String> arr){
        if (idx==s.length()){
            arr.add(str);
            return;
        }
        
        print(s,idx+1,str+s.charAt(idx),arr);
        print(s,idx+1,str,arr);
    }
}
