/*
Subarray sum
Difficulty: MediumAccuracy: 31.34%Submissions: 463+Points: 4
Given an integer array arr[]. Find the maximum sum of the subarray that starts and ends with the same value element. A single value subarray can be considered as the start and end with the same element.
Note: The answer will always fit into a 32-bit integer.

Examples:

Input: arr[] = [2, 6, 4]
Output: 6
Explanation:
The maximum sum of the subarray is 6 because there is no such subarray where starting and ending point is same and 6 is the maximum element.
Input: arr[] = [6, 3, 2, 3, 2, 6]
Output: 22
Explanation: Maximum sum of subarray is 22 where the subarray is starting with 6 and ending with 6.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
*/

import java.util.*;

class Solution {
    public int max_sum(int[] arr) {

        int n = arr.length;

        // prefix sum
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        Map<Integer, Integer> mp = new HashMap<>();
        int maxSum = 0;

        for (int i = 0; i < n; i++) {

            // single element case
            maxSum = Math.max(maxSum, arr[i]);

            if (mp.containsKey(arr[i])) {
                int start = mp.get(arr[i]);

                // sum from start to i
                int sum = prefix[i + 1] - prefix[start];

                maxSum = Math.max(maxSum, sum);
            } else {
                mp.put(arr[i], i); // store first occurrence only
            }
        }

        return maxSum;
    }
}

public class SubArraySumGFG{

}