public class Solution_rec {
    int[] memo;
    private int CalcWays(int n){

        if (n == 0 || n == 1) {
            return 1;
        }
        if(memo[n] == 0)
            memo[n] = CalcWays(n - 1) + CalcWays(n - 2);
        return memo[n];
    }
    public int climbStairs(int n) {
        memo = new int[n+1];
            return CalcWays(n);
    }

    public static void main(String[] args) {
        System.out.println(new Solution_rec().climbStairs(2));

    }
}
