// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int N, int[] nums, int k) {
        
        return subs(0,nums,k,0);
    }
    
    public static boolean subs(int idx,int[] nums,int k,int sum){
        if (sum > k) return false;

        if (sum == k) return true;

        if (idx == nums.length) return false;
        
        if (subs(idx + 1, nums, k, sum + nums[idx])) {
            return true;
        }

        return subs(idx + 1, nums, k, sum);
    }
}
