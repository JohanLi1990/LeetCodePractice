package com.shuati;

import org.jetbrains.annotations.Nullable;

/* Merge two sorted linked lists and return it as a new list.
                The new list should be made by splicing together the nodes of the first two lists.

                Example:

                Input: 1->2->4, 1->3->4
                Output: 1->1->2->3->4->4 */
       //the Idea:
// wh
public class LC_21_MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //idea just compare the nodes along the way
        if (l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = (l1.val <= l2.val) ? l1 : l2;
        while (p1 != null && p2 != null){
            if (p1.val <= p2.val){
                //move p1 to a place where p1.next.val > p2.val
                p1 = LinkSmallToBig(p1, p2);
            } else {
                p2 = LinkSmallToBig(p2, p1);
            }
        }
        return head;
    }

    @Nullable
    private ListNode LinkSmallToBig(ListNode p1, ListNode p2) {
        while ((p1.next!= null) && (p1.next.val <= p2.val)){
            p1 = p1.next;
        }
        ListNode temp = p1.next;
        p1.next = p2;
        p1 = temp;
        return p1;
    }
}
