package Remove_Linked_list_Element;

public class Solution2 {
    private static ListNode removeElements(ListNode head, int val){

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;

        while (prev.next != null){
            if(prev.next.val == val) {
                prev.next = prev.next.next;
            }
            else{
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int [] nums = {1 , 2 , 6, 5};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (removeElements(head,2));
        System.out.println(res);
    }
}
