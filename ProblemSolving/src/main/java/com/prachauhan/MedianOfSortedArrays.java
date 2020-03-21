package com.prachauhan;

import java.util.*;

/**
 * Median of two int arrays
 * Time Complexity O(n)
 * @author prachichauhan
 */
public class MedianOfSortedArrays {
    private static double median;
    private static TreeSet<Integer> treeSet = new TreeSet<>();
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        median = sortedSet(nums1, nums2);
        return median;
    }
    
    private double sortedSet(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        for (int i : mergedArray) {
            treeSet.add(i);
        }
        Iterator iterator = treeSet.iterator();
        return findMedian(treeSet.toArray());
    }
    
    private double findMedian(Object[] sortedArray) {
        int len = sortedArray.length;
        int v1 = (int) sortedArray[len / 2];
        int v2 = (int) sortedArray[(len - 1) / 2];
        if (len % 2 == 0) {
            return ((double)(v1 + v2) / 2);
        } else
            return v1;
    }
}