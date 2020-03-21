package com.prachauhan;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfSortedArraysTest {
    @Test
    public void medianOfSortedArrays() {
        MedianOfSortedArrays medianOfSortedArrays = new MedianOfSortedArrays();
        int[] nums1 = {0,0};
        int[] nums2 = {0,0};
        double med = medianOfSortedArrays.findMedianSortedArrays(nums1, nums2);
        Assert.assertEquals(med,0.0,0);
    }
}
