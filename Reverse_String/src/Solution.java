class Solution {
    public String reverseString(String s) {
        char[] w = s.toCharArray();
        int length = s.length();
        int left = 0 ,right = length-1;
        while (left<right){
            char temp = w[left];
            w[left] = w[right];
            w[right] = temp;
            left++;
            right--;
        }
        return new String(w);
    }

/*    public String reverseString(String s) {

        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(s.charAt(length - 1 - i));
        }

        return sb.toString();
    }*/
    public static void main(String[] args) {
        System.out.println(new Solution().reverseString("hello"));
    }
}

