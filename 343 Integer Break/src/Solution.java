/*Given a positive integer n,
break it into the sum of at least two positive integers and maximize the product of those integers.
Return the maximum product you can get.

Input: 10
Output: 36
Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
*/
class Solution {
    public int integerBreak(int n) {
        int [] memo = new int[n+1];
        //memo[i]表示将i进行分割后得到的最大乘积
        memo[1] = 1;
        for (int i = 2; i <= n ; i++) {

            //求解memo[i]
            for (int j = 1; j <= i - 1; j++) {
                //j + (i-j)
                memo[i] = Math.max(memo[i], Math.max(j * (i - j), j * memo[i-j]));
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().integerBreak(10));
    }
}