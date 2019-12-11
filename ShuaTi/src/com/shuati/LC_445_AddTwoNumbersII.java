package com.shuati;

import java.util.List;
import java.util.Stack;

public class LC_445_AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //last in first out bitch!!
        // my oh my
        // use stack
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null ){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode res = new ListNode(-1);
        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int digit = (s1.isEmpty() ? 0 : s1.pop()) + (s2.isEmpty() ? 0 : s2.pop()) + carry;
            carry = digit / 10;
            ListNode cur = new ListNode(digit % 10);
            cur.next = res.next;
            res.next = cur;
        }
        return res.next;
    }
}
