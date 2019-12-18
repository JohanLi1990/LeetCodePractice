package com.shuati;

import java.util.List;

public class LC_148_Sort_List {
    public ListNode sortList(ListNode head) {
        //Sort a linked list in O(n log n) time using constant space complexity.
        //O(1) O(n Log n)
        //two pointer, fast and slow
        //split two lines
        //then merge together
        //edge case 1: [1]
        if (head == null || head.next == null){
            return head;
        }

        //edge case 2: [2, 1]
        if (head.next.next == null){
            //reverse
            if (head.val > head.next.val){
                ListNode cur = head.next;
                head.next = null;
                cur.next = head;
                return cur;
            } else {
                return head;
            }
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode part2 = slow.next;
        slow.next = null;
        ListNode sorted1 = sortList(head);
        ListNode sorted2 = sortList(part2);

        return mergeLL(sorted1, sorted2);
    }

    private ListNode mergeLL(ListNode l1, ListNode l2){
        ListNode cur = new ListNode(-1);
        ListNode head  = cur;
        while (l1 !=null && l2 != null){
            // if one of them is null
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null){
            cur.next = l1;
        }
        if (l2 != null){
            cur.next = l2;
        }
        // if both are null, the merge are complete
        return head.next;
    }
}
