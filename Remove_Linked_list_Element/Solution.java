package Remove_Linked_list_Element;

import java.util.Scanner;

public class Solution {
    public static ListNode removeElements(ListNode head){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return null;
        }

        ListNode prev = head;

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

        ListNode res = (removeElements(head));
        System.out.println(res);
    }
}

