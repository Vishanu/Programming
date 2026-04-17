// 334. Increasing Triplet Subsequence(leetcode)

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int it : nums) {
            if (it <= smallest) {
                smallest = it;
            } else if (it <= secondSmallest) {
                secondSmallest = it;
            } else {
                return true;
            }
        }

        return false;
    }
}
public class IncreasingTripletSubsequence{
    public static void main(String [] args){
        
    }
}