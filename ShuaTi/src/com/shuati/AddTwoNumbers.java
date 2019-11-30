package com.shuati;

import org.w3c.dom.ls.LSException;

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
        while(l1 != null) {
            // normal case
            if (l2 != null) {
                int temp  = l1.val + l2.val + carry;
                head.next = new ListNode(temp % 10); // only keep the modulo
                carry = temp / 10;
                l1 = l1.next;
                l2 = l2.next;
                head = head.next;
            } else {
                head.next = new ListNode((l1.val + carry) % 10);
                carry = (l1.val + carry) / 10;
                head = head.next;
                l1 = l1.next; // l2 is already empty
            }
        }
        //in the event that l2 is longer
        while (l2 != null){
            head.next = new ListNode((l2.val + carry) % 10);
            carry = (l2.val + carry) / 10;
            head = head.next;
            l2 = l2.next;
        }

        if (carry != 0){
            head.next = new ListNode(carry);
        }
        //result is always ther
        return result.next;
    }
}
