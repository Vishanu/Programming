//53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int sum = nums[0];
        for(int i = 0; i<nums.length; i++){
            maxSum = Math.max(maxSum+nums[i], nums[i]);
            sum = Math.max(sum, maxSum);
        }
        return sum;
    }
}
public class KadansAlgo {
    
}
