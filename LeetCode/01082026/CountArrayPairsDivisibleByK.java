/**
 2183. Count Array Pairs Divisible by K
Solved
Hard
Topics
premium lock icon
Companies
Hint
Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) such that:

0 <= i < j <= n - 1 and
nums[i] * nums[j] is divisible by k.
 

Example 1:

Input: nums = [1,2,3,4,5], k = 2
Output: 7
Explanation: 
The 7 pairs of indices whose corresponding products are divisible by 2 are
(0, 1), (0, 3), (1, 2), (1, 3), (1, 4), (2, 3), and (3, 4).
Their products are 2, 4, 6, 8, 10, 12, and 20 respectively.
Other pairs such as (0, 2) and (2, 4) have products 3 and 15 respectively, which are not divisible by 2.    
Example 2:

Input: nums = [1,2,3,4], k = 5
Output: 0
Explanation: There does not exist any pair of indices whose corresponding product is divisible by 5.
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i], k <= 105
 */

class Solution {
    private long gcd(long a, long b){
        while(b != 0){
            long t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    
    public long countPairs(int[] nums, int k) {
        Map<Long, Long> count = new HashMap<>();
        for(int num:nums){
            long g = gcd(num, k);
            count.put(g, count.getOrDefault(g,0L) + 1L);
        }

        List<Long> divisors = new ArrayList<>(count.keySet());
        long result = 0;
        for(int a = 0; a<divisors.size(); a++){
            for(int b = a; b<divisors.size(); b++){
                long l1 = divisors.get(a);
                long l2 = divisors.get(b);
                if((l1*l2) % k == 0){
                    if(l1 == l2){
                        long c = count.get(l1);
                        result += c * (c-1)/2;
                    }else{
                        result += count.get(l1)*count.get(l2);
                    }
                }
            }
        }
        return result;
    }
}