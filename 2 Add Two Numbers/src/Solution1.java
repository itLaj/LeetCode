

class Solution1 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }



    public ListNode addFirst(ListNode l, int a) {
        ListNode resl = new ListNode(0);
        resl.next = l;
        resl.val = a;
        return resl;
    }

    public ListNode addLast(ListNode l, int a){
            ListNode tmp = l;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new ListNode(a);
            return l;
    }

    ListNode removeHead(ListNode l ){
        return l.next;
    }



    public ListNode initl2() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = addFirst(l1, 4);
        l2 = addFirst(l2, 3);
        l2 = addFirst(l2, 4);
        return l2;
    }

    public ListNode addTwoNumbers() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);

        l1 = addFirst(l1, 8);

        int i = 0;
        int end1 = 0;
        int end2 = 0;
        ListNode tem1 = l1;
        ListNode tem2 = l2;
        ListNode res = new ListNode(0);
        int flag = 0;
        int n = 1;
        int a = 0, b = 0;
        while (end1 != 1 || end2 != 1) {
            if (end1 != 1) {
                a = tem1.val;
            } else {
                a = 0;
            }
            if (end2 != 1) {
                b = tem2.val;
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
            if (tem1.next == null) {
                end1 = 1;
            }else{
                tem1 = tem1.next;
            }
            if (tem2.next == null) {
                end2 = 1;
            }else{
                tem2 = tem2.next;
            }
            if(flag ==1){
                res = addLast(res,1);
            }


            System.out.println(tmp);
            res = addLast(res, tmp);
        }

        return res;
    }

    public int[] isBigger(int a, int b) {
        int[] res = {0, 0};
        res[0] = (a + b);
        if ((a + b) >= 10) {
            res[0] = (a + b) - 10;
            res[1] = 1;
        }
        return res;
    }


    public static void main(String[] args) {
        new Solution1().addTwoNumbers();

    }
}