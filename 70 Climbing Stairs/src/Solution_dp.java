public class Solution_dp {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i <=n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println(new Solution_dp().climbStairs(2));

    }
}
