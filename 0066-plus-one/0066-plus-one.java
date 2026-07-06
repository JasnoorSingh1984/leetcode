class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr=new ArrayList<>();

        for (int i=0;i<digits.length;i++){
            arr.add(digits[i]);
        }

        int carry=1;
        for (int i=arr.size()-1;i>=0;i--){
            arr.set(i,arr.get(i)+1);

            carry=arr.get(i)/10;
            arr.set(i,arr.get(i)%10);

            if (carry==0){
                break;
            }
        }

        if (carry==1){
            arr.add(0,1);
        }

        int[] num=new int[arr.size()];
        for (int i=0;i<arr.size();i++){
            num[i]=arr.get(i);
        }

        return num;
    }
}