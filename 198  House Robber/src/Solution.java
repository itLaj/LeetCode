class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        //memo[i]表示抢劫memo[i ... n-1]所能获得的最大收益
        int[] memo = new int[n];
        memo[n - 1] = nums[n - 1];
        for (int i = n-2  ; i >=0 ; i--) {
            //memo[i]
            for (int j = i ; j < n; j++) {
                //memo[i] =Math.max(memo[i], nums[j] + (j + 2 < n ? memo[j + 2] : 0));
                memo[i] =(memo[i] > (nums[j] + (j + 2 < n ? memo[j + 2] : 0))?memo[i]:(nums[j] + (j + 2 < n ? memo[j + 2] : 0)));
            }
        }
        return memo[0];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int []{2,7,9,3,1}));
    }
}
