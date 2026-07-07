class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        String[] arr=new String[numRows];
        for (int i=0;i<arr.length;i++){
            arr[i]="";
        }
        int row=0;
        boolean uptodown=true;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (row==0){
                uptodown=true;
            }else if (row==numRows-1){
                uptodown=false;
            }

            if (uptodown){
                arr[row]+=ch;
                row++;
            }else{
                arr[row]+=ch;
                row--;
            }
        }

        String str="";

        for (int i=0;i<arr.length;i++){
            str+=arr[i];
        }

        return str;
    }
}