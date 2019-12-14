package com.shuati;

import java.util.List;

//Given linked list: 1->2->3->4->5, and n = 2.
//
//        After removing the second node from the end, the linked list becomes 1->2->3->5.
public class LC_19_RemoveNthNode_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Challenge do it in one pass
        //first pointer moves till the end, second pointer moves n step
        // behind
        ListNode p1 = head;
        ListNode p2 = new ListNode(-1);
        p2.next = head;
        int total = n - 1;
        while (p1.next != null){
            if (total > 0){
                total--;
            } else {
                p2 = p2.next;
            }
            p1 = p1.next;
        }

        if (p2.val == -1){
            //supposed to remove the head;
            return head.next;
        }

        ListNode next = p2.next.next;
        p2.next = next;
        return head;
    }
}
