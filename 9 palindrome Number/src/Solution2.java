public class Solution2 {
    public boolean isPalindrome(int x) {
        if(x < 0 ||( x %10 == 0 && x != 0)) return false;
        if (x<10) return true;
        int a = 0 ,b = x ;
        while (x != 0) {
            a = a*10 + x % 10;
            x = x/10;
        }
        return a == b;
    }
    public static void main(String[] args) {
        System.out.println(new Solution2().isPalindrome(121));

    }
}
