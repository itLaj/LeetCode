
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
Input: 121
Output: true
Input: -121
Output: false

*/
class Solution {

    public boolean isPalindrome(int x) {
        Stack<Integer> sta = new Stack<>();
        LinkedBlockingQueue<Integer> que = new LinkedBlockingQueue<Integer>();
        if(x < 0 ) return false;
        if (x<10) return true;
        while(x!=0){
            sta.push(x % 10);
            que.offer(x % 10);
            x = x / 10;
        }
        while(!sta.isEmpty() && !que.isEmpty()){
            if(sta.pop()!=que.poll()) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(123));

    }
}