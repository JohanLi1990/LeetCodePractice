package com.shuati;

//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//        Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//        You may assume nums1 and nums2 cannot be both empty.
//
//        Example 1:
//
//        nums1 = [1, 3]
//        nums2 = [2]
//
//        The median is 2.0
//        Example 2:
//
//        nums1 = [1, 2]
//        nums2 = [3, 4]
//
//        The median is (2 + 3)/2 = 2.5

import org.jetbrains.annotations.NotNull;

/**
 * Idea:
 * Defintion of median:
 * even : sorted_number of items on the left = sorted_number of items on the right
 * odd : sorted_number of items on the left = sorted_number of items on the right - 1
 * <p>
 * i (0, 1, 2...) = 1/2 * ( m + n) - j ----even
 * i = 1/2 * (m + n + 1) - j ----odd
 */
public class Median_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return cutArray(nums2, n, nums1, m, n / 2);
        } else {
            return cutArray(nums1, m, nums2, n, m / 2);
        }

    }

    /*
    initial cut is the cut on the short array, based on ini
     */
    private double cutArray(@NotNull int[] shorterArray, int shortLength, int[] longerArray, int longLength, int theCut) {
        return 0;
    }
}
