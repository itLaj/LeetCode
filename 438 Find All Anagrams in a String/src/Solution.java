import java.util.*;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int length = p.length();
        //用一个大小为128的数组存放p内的每个字母的个数
        int[] tmp = new int[128];
        for (int i = 0; i < length; i++) {
            tmp[p.charAt(i)]++;
        }
        for (int j = 0; j < s.length() - p.length() + 1; j++) {
            int a = findSub(s, tmp, j, length);
            if (a >= 0) res.add(a);
        }
        return res;
    }

    /**
     * 判断s中以第index个字母开头的长度为length的字符串是否满足题意
     * @param s
     * @param tmp
     * @param index
     * @param length
     * @return
     */
    private int findSub(String s, int[] tmp, int index, int length) {
        int[] t1 = tmp.clone();
        for (int i = index; i < index + length; i++) {
            if (t1[s.charAt(i)] <= 0) {
                return -1;
            } else
                t1[s.charAt(i)]--;
        }

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] != 0) return -1;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findAnagrams("cbaebabacd", "abc"));
    }

}

