/**
 * Given n non-negative integers a1, a2, ..., an ,
 * where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 */
public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        //利用双指针，分别指向数组的首位，储水量由两根指针中较短的一根决定，
        // 只有当较短的一侧向内扩展时，储水量才有可能增加
        while (left != right) {
            int minIndex = height[left] < height[right] ? left : right;
            int tem = height[minIndex] * (right - left);
            max = max > tem ? max : tem;
            if (minIndex == left) left++;
            else right--;
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
