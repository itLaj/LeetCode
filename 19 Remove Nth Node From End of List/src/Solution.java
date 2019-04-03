

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //虚拟头节点 记录链表头的位置  可以不用判断删除元素为头节点的情况
        ListNode viHead;

        //pre记录倒数第n个节点的前一个节点
        ListNode pre = new ListNode(0);
        pre.next = head;
        viHead = pre;

        //cur置为pre后的第n个位置
        ListNode cur = pre.next;
        for (int i = 1; i < n; i++) {
            cur = cur.next;
        }
        //pre和cur一起向后移动直至末尾
        while (cur.next != null) {
            pre = pre.next;
            cur = cur.next;
        }
        //删除pre的下一个元素
        pre.next = pre.next.next;

        return viHead.next;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        System.out.println(new Solution().removeNthFromEnd(listNode, 1).val);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
