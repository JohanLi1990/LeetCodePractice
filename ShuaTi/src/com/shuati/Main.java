package com.shuati;

import java.util.Arrays;

//LeetCode Studying Approach
//
//1. Do Breadth-First Scan of “Easy” questions from each Topic on Leetcode
//    1. Try to get it right on the first try
//    2. Should be finishing these in < 10 minutes
//    3. Take note of which sections you struggled at (the following was for me)
//        1. Trees
//        2. Dynamic Programming
//2. Do more “Easy” questions from the topics you struggled at
//3. Shuffle “Medium” problems
//    1. Only do the problems you are not 100% sure how to do
//    2. Start a 25 minute pomodoro timer and attempt to solve it
//    3. If the problem isn’t solved in 25 minutes, take a look at the discussion section but do NOT look at code just yet
//        1. Reset the timer and do another pomodoro
//        2. Once the problem is done, look at the discussion section and understand how other people solved it
//        3. Write this problem down in your notes as a problem you need to revisit
//4. Do the popular “Hard” problems from each Topic
//    1. Try to finish these within 45 minutes
//5. Do a mock interview AT LEAST once a week
//6. Towards the last month of interview prep, do the 1-month term plan in EPI on PAPER
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
