package com.shuati;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //idea:
        //create new ListNode result
        // ListNode head = result;
        //if both l1.val and L2.val
        //  result.val = l1.val + l2.val
        //  result = result.next; l1 = l1.next; l2 = l2.next
        // if l1.val xor l2.val
        //  result.val = l1.val?l1.val !=null : l2.val;
        //  result = result.next; l1 = l1.next; l2 = l2.next;
        // else return head
        ListNode result = new ListNode(-1);
        ListNode head = result;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            // normal case
            int temp  = (l1!=null?l1.val:0) + (l2!=null?l2.val:0) + carry;
            head.next = new ListNode(temp % 10);
            carry = temp / 10;
            l1 = (l1 != null)?l1.next : null;
            l2 = (l2 != null)?l2.next : null;
            head = head.next;
        }
        //result is always ther
        return result.next;
    }
}
