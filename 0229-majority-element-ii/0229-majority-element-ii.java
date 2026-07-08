class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int ele1=-1;
        int ele2=-1;

        for (int i=0;i<nums.length;i++){
            if (nums[i]==ele1){
                count1++;
            }else if (nums[i]==ele2){
                count2++;
            }else if (count1==0){
                count1=1;
                ele1=nums[i];
            }else if(count2==0){
                count2=1;
                ele2=nums[i];
            }else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for (int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                count1++;
            }else if (nums[i]==ele2){
                count2++;
            }
        }

        List<Integer> list=new ArrayList<>();

        if (count1>nums.length/3){
            list.add(ele1);
        }
        if (count2>nums.length/3){
            list.add(ele2);
        }

        return list;
    }
}