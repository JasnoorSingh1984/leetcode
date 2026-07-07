class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }

        StringBuilder[] arr=new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
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
                arr[row].append(ch);
                row++;
            }else{
                arr[row].append(ch);
                row--;
            }
        }

        StringBuilder str=new StringBuilder();

        for (int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }

        return str.toString();
    }
}