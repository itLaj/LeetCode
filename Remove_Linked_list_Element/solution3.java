package Remove_Linked_list_Element;

import java.util.Stack;

public class solution3 {
    private static ListNode removeElements(ListNode head,int val){
        if (head == null){return null;}
        head.next = removeElements(head.next,val);
        return  head.val == val ? head.next: head;

    }
    public static void main(String[] args) {
        int [] nums = {1 , 2 , 6, 5 ,2};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (removeElements(head,2));
        System.out.println(res);
    }
}
