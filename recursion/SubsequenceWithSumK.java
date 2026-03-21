
import java.util.ArrayList;

class SubsequencesWithSumK{
    static void printS(int index, ArrayList<Integer>a, int sum, int target, int []arr, int n){
        if(index == n){
            if(sum == target){
                for(int it : a){
                    System.out.print(it+" ");
                }
                System.out.println();
            }
            return;
        }
        a.add(arr[index]);
        sum += arr[index];
        printS(index+1, a, sum, target, arr, n);
        sum -= arr[index];
        a.remove(a.size()-1);
        printS(index+1, a, sum, target, arr, n);
    }
    public static void main(String[] args) {
        int []arr = {1,2,1};
        int n = 3;
        int target = 2;
        ArrayList<Integer> a = new ArrayList<>();
        printS(0, a, 0,target, arr, n);
    }
}