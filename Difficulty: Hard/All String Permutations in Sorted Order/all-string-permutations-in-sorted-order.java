class Solution {
    public ArrayList<String> permutation(String s) {
        ArrayList<String> arr=new ArrayList<>();
        check(s,0,arr);
        Collections.sort(arr);
        return arr;
    }
    
    public void check(String str,int idx,ArrayList<String> arr){
        if (idx==str.length()){
            arr.add(new String(str));
        }
        
        for (int i=idx;i<str.length();i++){
            str=swap(str,i,idx);
            check(str,idx+1,arr);
            str=swap(str,i,idx);
        }
    }
    
    public String swap(String str,int i,int idx){
        char[] arr=str.toCharArray();
        
        char temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
        
        return new String(arr);
    }
}