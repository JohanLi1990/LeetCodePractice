package com.shuati;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //TwoSum
        System.out.println("LC1: Two Sum: \n");
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 3}, 6);
        System.out.println(Arrays.toString(result));

        //AddTwoNumbers
        System.out.println("LC2: AddTwoNumbers\n");
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);//2 ->3 ->4
        ListNode l2 = new ListNode(8);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(6);//8 ->1 ->6
        AddTwoNumbers addTwo = new AddTwoNumbers();
        ListNode result2 = addTwo.addTwoNumbers(l1, l2);
        while (result2 != null){
            System.out.println(result2.val);
            result2 = result2.next;
        }

        //Longest Substring
        System.out.println("LC3: Length of Longest Substring without repeat:\n");
        LongestSubstring lsub = new LongestSubstring();
        System.out.println(lsub.lengthOfLongestSubstring("pppp"));
    }
}
