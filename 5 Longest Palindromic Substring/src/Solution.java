/*Given a string s, find the longest palindromic substring(回文的) in s.
You may assume that the maximum length of s is 1000.*/
class Solution {
    int lo,hi,leng=0;
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        for (int i = 0; i < s.length(); i++) {
            judge(s, i, i);
            judge(s, i, i+1);
        }
        return s.substring(lo, lo + leng);
    }
    //判断[i ... j ]是否为回文串
    private int[] judge(String s,int i ,int j){
        //判断s[i..j]是否为回文串，若是，则向两边扩展，判断是否还是回文串
        while ((i>=0 && j< s.length()&& s.charAt(i)==s.charAt(j)) ){
            i--;
            j++;
        }
        //i,j都进行了一次多余的加减操作
        if (j - i - 2 + 1 > leng) {
            lo = i+1;
            leng = j - i - 1;
        }
        return new int[]{lo, hi, leng};
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }
}