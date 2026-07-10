class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        k=nums.length-k;

        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=k;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for (int i=0;i<k;i++){
            arr.add(nums[i]);
        }

        for (int i=0;i<nums.length;i++){
            nums[i]=arr.get(i);
        }
    }
}