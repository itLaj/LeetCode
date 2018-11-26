
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int a1 = 0;
        int a2 = 0;
        double res = 0;
        if(size%2 == 0 ){
            for (int i = 0; i < size - 1  ; i++) {
                if (nums1[a1] < nums2[a2]) {
                    a1++;
                }else{
                    a2++;
                }
                if ((a1 + a2 + 2) == (size / 2 +1)) {
                    break;
                }
            }
            res = (double)(nums1[a1] + nums2[a2])/2;
        } else{
        for (int i = 0; i < size - 1  ; i++) {
            if (nums1[a1] < nums2[a2]) {
                a1++;
            }else{
                a2++;
            }
            if ((a1 + a2 + 2) == (size / 2 +1)) {
                break;
            }
        }
            res = nums1[a1] + nums2[a2];

        }
        return res;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        System.out.println(new Solution().findMedianSortedArrays(a, b));
    }
}