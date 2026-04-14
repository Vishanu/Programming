package practicejava.arraylist;

import java.util.ArrayList;

//Running Sum of 1d Array
public class RunningSumOf1dArray {

    public static int[] runningSumWithArrayList(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int a = 0;
        for(int i = 0; i<nums.length; i++){
            a = a + nums[i];
            al.add(a);
        }
        int [] arr = al.stream().mapToInt(i->i).toArray();
        return arr;
    }
    public static int[] runningSumWithoutArrayList(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum+nums[i];
            nums[i] = sum;
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] arr2 = runningSumWithoutArrayList(arr);
        for(int i:arr2){
            System.out.println(i+" ");
        }
        System.out.println("--------------------------");
        int [] arr3 = runningSumWithArrayList(arr);
    
        for(int i:arr3){
            System.out.println(i+" ");
        }

    }
}
