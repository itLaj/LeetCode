import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int tem, lo = 1, ri = length - 1, sum;
        sum = nums[0] + nums[lo] + nums[ri];
        tem = ((target - sum) > 0 ? (target - sum) : -(target - sum));
        for (int i = 0; i < length - 2; i++) {
            sum = nums[i] + nums[lo] + nums[ri];
            tem = target - sum;
            while (sum > target && lo < ri - 1) {
                ri--;
                sum = nums[i] + nums[i + 1] + nums[ri];
                tem = ((sum - target) > tem ? tem : (sum - target));
            }
            while (sum <= target && lo < ri - 1) {
                lo++;
                sum = nums[i] + nums[lo] + nums[ri];
                tem = ((target - sum) > tem ? tem : (target - sum));

            }

        }

        return tem;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}