/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/


import java.util.HashMap;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = {0, 0};
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (mp.containsKey(target - nums[i])) {
                res[0] = mp.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            mp.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {3,3};
        System.out.println(new Solution().twoSum(a, 6)[0]);
        System.out.println(new Solution().twoSum(a, 6)[1]);
    }
}