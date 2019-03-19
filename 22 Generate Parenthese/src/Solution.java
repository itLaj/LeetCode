import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                a.add("(");
            }

        }
        return a ;
    }

}