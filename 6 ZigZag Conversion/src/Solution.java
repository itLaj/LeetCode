/*
* The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
* (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

*/

class Solution {

    StringBuilder[] out;
    int row = 0;

    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() == 1) return s;
        out = new StringBuilder[numRows];
        //out数组的每一行都是一个StringBuffer用来存放每一行的字符串
        for (int i = 0; i < numRows; i++) {
            out[i] = new StringBuilder();
        }
        out[0].append(s.charAt(0));

        //整个循环是对字符串中元素的遍历
        for (int i = 0; i < s.length();) {
            //对字符串进行之字型的转换可以看出是row不断变化，每当row变为0时就完全填充这一列的字符串
            if (row == 0) {
                while (row != numRows-1 ) {
                    if (i == s.length() - 1) {
                        break;
                    }
                    row++;
                    i++;
                    out[row].append(s.charAt(i));

                }
            }
            if (i == s.length() - 1) {
                break;
            }
            //当row 不为零时，按行依次填充
            row--;
            i++;
            out[row].append(s.charAt(i));

        }

        for (int i = 1; i < numRows; i++) {
            out[0].append(out[i]);
        }
        return out[0].toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().convert("PAYPALISHIRING", 4));
    }
}