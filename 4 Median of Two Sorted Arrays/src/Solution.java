/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
You may assume nums1 and nums2 cannot be both empty.*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        double mid = 0, mid1, mid2;

        return mid;
    }

    private double find(int[] nums1, int[] nums2, int start1, int end1, int start2, int end2) {
        int length1 = end1 + start1;
        int length2 = end2 + start2;
        double mid = 0, mid1 = 0, mid2 = 0;
        if (mid1 == mid2) {
            return mid1;
        }

        if (length1 % 2 != 0) {
            mid1 = (nums1[length1 / 2] + nums1[length1 / 2 + 1]) / 2;
        } else {
            mid1 = nums1[length1 / 2];
        }
        if (length2 % 2 == 0) {
            mid2 = (nums1[length2 / 2] + nums1[length2 / 2 + 1]) / 2;
        } else {
            mid2 = nums1[length2 / 2];
        }

        if (mid1 < mid2) {
            mid = find(nums1, nums2, length1 / 2, end1, start2, length2 / 2);
        } else if (mid1 > mid2) {
            mid = find(nums1, nums2, start1, length2 / 2, length2 / 2 , end2);
        }
        return  0;

    }



    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        System.out.println(new Solution().findMedianSortedArrays(a, b));
    }
}