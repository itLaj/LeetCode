/*Given a string, find the length of the longest substring without repeating characters.

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []a =new int[256];
        int Sub = 0;
        int tmp = 0;
        int l = 0;
        int r = 0;
        for (; r < s.length();) {
            if (a[s.charAt(r)] == 0){
                a[s.charAt(r)] += 1;
                r++;
            } else if (a[s.charAt(r)] > 0){
                a[s.charAt(l)] -= 1;
                l++;
            }
            Sub = (r-l > Sub? r-l:Sub);
        }
        return Sub;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
    }
}