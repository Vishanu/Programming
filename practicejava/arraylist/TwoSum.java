package Arraylist;

import java.util.ArrayList;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int it:nums){
            al.add(it);
        }
        for(int i = 0; i<nums.length; i++){
            int c = target - nums[i];
            if(al.contains(c) && al.indexOf(c) != i){
                return new int[]{al.indexOf(c), i}; 
            }
        }
        return null;
    }
}
