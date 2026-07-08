class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            if (nums[i]<0){
                neg.add(nums[i]);
            }else{
                pos.add(nums[i]);
            }
        }


        int i=0,j=0,k=0;
        while (i<pos.size() && j<neg.size()){
            nums[k++]=pos.get(i++);
            nums[k++]=neg.get(j++);
        }

        while (i<pos.size()){
            nums[k++]=pos.get(i++);
        }

        while (j<neg.size()){
            nums[k++]=pos.get(j++);
        }

        return nums;
    }
}