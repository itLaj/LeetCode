

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        if (strs.length == 0) return "";
        String res ;
        int t = 0;
        while (t < strs[0].length() && t < strs[1].length() && (strs[0].charAt(t) == strs[1].charAt(t))) {
            t++;
        }
        res = strs[0].substring(0, t);
        if (res.length() == 0) return "";
        for (int i = 2; i < strs.length; i++) {
            int j = 0;
            while (j < strs[i].length() && j < res.length() && (res.charAt(j) == strs[i].charAt(j))) {
                j++;
            }
            res = res.substring(0, j);
            if (res.length() == 0) return "";
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaa","aab"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"c","c"}));
    }
}
