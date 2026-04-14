//Quick Sort -> divide and conqure
//TC=O(N * log N)
//SC=O(N)
/* 
a. 1st element in the array
b. load element in the array
c. median of the array
d. random element of the array


    1. pick a pivot and place it in its correct place in the sorted array
    2. smaller on the left larger on the right

TC -> N log N 
SC -> O(1)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
    static int partition(ArrayList<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while(i < j){
            while(arr.get(i) <= pivot && i <= high-1){
                i++;
            }
            while(arr.get(j) > pivot && j >= low+1){
                j--;
            }
            if(i < j) {
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, low, j);
        return j;
    }
    
    
    static void qS(ArrayList<Integer> arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            qS(arr, low, pIndex-1);
            qS(arr, pIndex+1, high);
        }
    }
    
    static void quickSort(ArrayList<Integer> arr, int n){
        qS(arr, 0, n);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(
            // List.of(4,6,2,5,7,9,1,3) as well as
            Arrays.asList(4,6,2,5,7,9,1,3)
        );
        int n = arr.size()-1;
        quickSort(arr, n);
        System.out.println(arr);
    }
}
