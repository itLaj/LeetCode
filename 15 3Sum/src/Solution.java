import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //初始化sum =  nums[i]
        //遍历数组找到sum[lo] + sum[hi] + sum == 0

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int sum = nums[i];
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                if (nums[lo] + nums[hi] + sum == 0) {
                    res.add(Arrays.asList(nums[lo], nums[hi], sum));
                    hi--;
                    lo++;
                    while (lo < hi && nums[hi] == nums[hi + 1 ]) hi--;
                    //必须是nums[hi] == nums[hi + 1 ]而不是nums[hi] == nums[hi-1]，因为hi+1已经判断过而hi-1没有，下同理
                    while (lo < hi && nums[lo] == nums[lo -1]) lo++;
                } else if (nums[lo] + nums[hi] + sum < 0) lo++;
                else hi--;
            }

        }
        return res;
    }
        public static void main (String[]args){
            List<List<Integer>> res1 = new Solution().threeSum(new int[]{-2,0,1,1,2});
            for (List i : res1) {
                for (int j = 0; j < i.size(); j++) {
                    System.out.println(i.get(j));

                }
            }
        }
    }