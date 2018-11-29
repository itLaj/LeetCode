public class Solution_dp {

    public int lengthOfLIS(int[] nums) {
        int size = nums.length;
        if (size == 0) return 0;
        //memo[i]表示以nums[i]为结尾的最长上升子序列
        int[] memo = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    memo[i] = memo[i] > (1 + memo[j]) ? memo[i] : (1 + memo[j]);
                }
            }
        }
        int res = 1;
        for (int i = 0; i < size; i++) {
            res = res > memo[i] + 1 ? res : memo[i] + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution_dp().lengthOfLIS(new int[]{10, 9, 2}));
    }
}
