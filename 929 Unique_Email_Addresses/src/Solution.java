import java.util.Arrays;
import java.util.List;

class Solution {
    public int numUniqueEmails(String[] emails) {
        int sum = 0;
        String[] s =new String[100];
        for (int i = 0; i < emails.length; i++) {
            String s1[] = emails[i].split("@");
            if (s1[0].contains("+")) {
                s1[0] = s1[0].split("[+]")[0];
            } if (s1[0].contains(".")) {
                String s2[] = s1[0].split("[.]");
                s1[0] = "";
                for (int j = 0; j < s2.length; j++) {
                    s1[0] += s2[j];
                }
            }
            s1[0] = s1[0] + "@" + s1[1];
            List<String> list = Arrays.asList(s);
            if (!list.contains(s1[0])) {
                s[i] = s1[0];
                sum += 1;
            }
        }


        return sum;

    }


    public static void main(String[] args) {
        args = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

                System.out.println(new Solution().numUniqueEmails(args));

    }
}