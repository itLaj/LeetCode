class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'I' && (i + 1 < size && s.charAt(i + 1) == 'V')) {
                res += 4;
                i++;
            } else if (s.charAt(i) == 'I' && (i + 1 < size && s.charAt(i + 1) == 'X')) {
                res += 9;
                i++;
            } else if (s.charAt(i) == 'V') {
                res += 5;
            } else if (s.charAt(i) == 'I') {
                res += 1;
            } else if (s.charAt(i) == 'X' && (i + 1 < size && s.charAt(i + 1) == 'L')) {
                res += 40;
                i++;
            } else if (s.charAt(i) == 'X' && (i + 1 < size && s.charAt(i + 1) == 'C')) {
                res += 90;
                i++;
            } else if (s.charAt(i) == 'X') {
                res += 10;
            } else if (s.charAt(i) == 'L') {
                res += 50;
            } else if (s.charAt(i) == 'C' && (i + 1 < size && s.charAt(i + 1) == 'D')) {
                res += 400;
                i++;
            } else if (s.charAt(i) == 'C' && (i + 1 < size && s.charAt(i + 1) == 'M')) {
                res += 900;
                i++;
            } else if (s.charAt(i) == 'C') {
                res += 100;
            } else if (s.charAt(i) == 'D') {
                res += 500;
            } else if (s.charAt(i) == 'M') {
                res += 1000;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("LVIII"));
    }
}

