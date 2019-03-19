class Solution {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (int j = 0; j < J.length(); j++) {
            for (int i = 0; i < S.length(); i++) {
                if (J.charAt(j) == S.charAt(i)) {
                    num++;
                }

            }
        }
        return num;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(new Solution().numJewelsInStones(J, S));
    }
}