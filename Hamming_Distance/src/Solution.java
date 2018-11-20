class Solution {
    public int hammingDistance(int x, int y) {
        int a = 0;
        int t = x ^ y;
        while (true) {

            if (t % 2 == 1) {
                a += 1;
            }
            t = t / 2;
            if (t == 0) {
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingDistance(93, 73));
    }
}