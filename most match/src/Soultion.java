public class Soultion {
    public static int match(String a, String b) {
        int count = 0;
        boolean ismatched = false;

        for (int i = 0; i < a.length() - b.length() + 1; i++) {
            int j = 0;
            for (; j < b.length(); j++) {
                if ((b.charAt(j) != a.charAt(i + j)) && (a.charAt(i + j) != '?')) {
                    break;
                }
            }
            if (j == b.length()) {
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(match("abab?ba", "ababa"));
    }
}
