package com.shuati;

//Example:
//
//        Given 1->2->3->4, you should return the list as 2->1->4->3.
public class LC_24_SwapPairNodes {
    public ListNode swapPairs(ListNode head) {
        //cannot modify val inside ListNode
        if (head == null || head.next == null){
            return head;
        }
        ListNode original = new ListNode(-1);
        ListNode pre, cur, after;
        original.next = head;
        pre = original;
        cur = head;
        after = head.next;
        while(after != null){
            pre.next = after;
            cur.next = after.next;
            after.next = cur;
            //move to next location
            if (cur.next == null){
                break;
            }
            pre = cur;
            cur = cur.next;
            after = cur.next;
        }

        return original.next;
    }

    public ListNode swapPairsRecursion(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode after = head.next;
        head.next = swapPairsRecursion(head.next.next);
        after.next = head;
        return after;
    }
}
