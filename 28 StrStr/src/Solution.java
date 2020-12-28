//实现 strStr() 函数。
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。
//
// 示例 1:
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
//
//
// 示例 2:
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
//
//
// 说明:
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
// Related Topics 双指针 字符串
// 👍 637 👎 0


/**
 * @author qushuai
 * @date 2020/12/9 17:15
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("hello", "ll"));
        System.out.println(new Solution().strStr("aaaaa", "bba"));
        System.out.println(new Solution().strStr("", ""));

    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }
        if (haystack.isEmpty() || needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                while (j < needle.length() && (i + j) < haystack.length()
                        && haystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;

    }
}
