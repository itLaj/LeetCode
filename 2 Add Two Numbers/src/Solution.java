

class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addLast(ListNode l, int a){
        ListNode tmp = l;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new ListNode(a);
        return l;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int i = 0;
        int end1 = 0;
        int end2 = 0;

        ListNode res = new ListNode(0);
        int flag = 0;
        int a = 0, b = 0;
        while (end1 != 1 || end2 != 1) {
            if (end1 != 1) {
                a = l1.val;
            } else {
                a = 0;
            }
            if (end2 != 1) {
                b = l2.val;
            } else {
                b = 0;
            }
            int tmp = 0;
            if (flag == 0) {
                tmp = isBigger(a, b)[0];
                flag = isBigger(a, b)[1];
            } else {
                tmp = isBigger(a, b + 1)[0];
                flag = isBigger(a, b + 1)[1];
            }
            if (l1.next == null) {
                end1 = 1;
            }else{
                l1 = l1.next;
            }
            if (l2.next == null) {
                end2 = 1;
            }else{
                l2 = l2.next;
            }
            res = addLast(res, tmp);
        }
        if(flag == 1){
            res = addLast(res,1);
            flag = 0;
        }

        return res.next;
    }

    public int[] isBigger(int a, int b) {
        int[] res = {0, 0};
        res[0] = (a + b) ;
        if ((a + b) >= 10) {
            res[0] = (a + b) -10;
            res[1] = 1;
        }
        return res;
    }


}