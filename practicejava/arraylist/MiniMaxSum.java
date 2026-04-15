//Mini-Max Sum (Hackerrank)

package Arraylist;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    private static long totalSum(List<Integer> arr){
        long sum = 0;
        for(long it:arr){
            sum += it;
        }
        return sum;
    } 
    
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long maxE = Collections.max(arr);
        long minE = Collections.min(arr);
        long totalSum = totalSum(arr);
        System.out.println((totalSum - maxE) + " " + (totalSum - minE));
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
