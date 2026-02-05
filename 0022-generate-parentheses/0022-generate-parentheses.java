class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();

        print(arr,sb,0,0,n);
        return arr;
    }

    public void print(List<String> arr,StringBuilder sb,int open,int close,int n){
        if (sb.length()==2*n){
            arr.add(sb.toString());
            return;
        }

        if (open<n){
            sb.append("(");
            print(arr,sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }

        if (close<open){
            sb.append(")");
            print(arr,sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}