import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        //存储所有的数字映射的字符
        List<String> charList = initList();
        //存储所需的数字的字符
        List<String> tempList = new ArrayList<>();

        List<String> res = new ArrayList<>();
        if (digits.length() ==0){
            return res;
        }
        if (digits.length() ==1){
            int num = Integer.parseInt(digits);
            String str = charList.get(num-2);
            for (int i = 0; i < str.length(); i++) {
                res.add(str.substring(i, i+1));
            }
            return res;
        }
        for (int i = 0; i < digits.length(); i++) {
            String tempStr = new String();
            int num = Integer.parseInt(digits.substring(i, i + 1));
            tempList.add(charList.get(num - 2));
        }
        //求出前两个数字对应字符的所有组合
        res = twoNumCombiantions(tempList.get(0), tempList.get(1));
        for (int i = 2; i < tempList.size(); i++) {
            //若传入数字超过两个 则将原来的结果扩展，直至求出所有解
            res = twoNumCombiantions(res, tempList.get(i));
        }
        System.out.println(res);
        return res;
    }

    /**
     * 传入字符大于两个时则将原来的list进行扩展
     * @param aList 前两个数字对应的字符组合
     * @param b 下一个数字对应的字符串
     * @return
     */
    private List<String> twoNumCombiantions(List<String> aList, String b) {

        List<String> res = new ArrayList<>();
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < b.length(); j++) {
                res.add(aList.get(i) + b.charAt(j));
            }
        }
        return res;
    }

    /**
     * 传入数字为两个时直接求两个数字对应字符串中的字符的全排列
     * @param a 第一个数字对应的字符串
     * @param b 第二个数字对应的字符串
     * @return{"ad","ae","af","bd"...}
     */
    private List<String> twoNumCombiantions(String a, String b) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                res.add(a.substring(i, i + 1) + b.substring(j, j + 1));
            }
        }
        return res;
    }

    /**
     * 初始化数字与字符串映射的数组
     * @return
     */
    private List<String> initList() {
        List<String> list = new ArrayList<>(8);

        char a = 'a';
        for (int i = 2; i < 10; i++) {
            StringBuffer str = new StringBuffer();
            str.append(a);
            str.append(++a);
            str.append(++a);
            if (a == 'r' || a == 'y') {
                str.append(++a);
            }
            list.add(str.toString());
            a++;
        }
        return list;
    }

    public static void main(String[] args) {
        new Solution().letterCombinations("2");
    }
}