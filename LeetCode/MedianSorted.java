// Link : https://leetcode.com/problems/median-of-two-sorted-arrays/description/
// Discription : Median of Two Sorted Arrays

public class MedianSorted {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1 > n2) return findMedianSortedArrays(nums2, nums1);
        int start = 0, end = n1, n = n1 + n2, left = (n + 1) / 2;
        while (start <= end) {
            int mid1 = start + (end - start) / 2;
            int mid2 = left - mid1;
            int l1 = mid1 - 1 >= 0 ? nums1[mid1 - 1] : Integer.MIN_VALUE, l2 = mid2 - 1 >= 0 ? nums2[mid2 - 1] :  Integer.MIN_VALUE;
            int r1 = mid1 < n1 ? nums1[mid1] :  Integer.MAX_VALUE, r2 = mid2 < n2 ? nums2[mid2] :  Integer.MAX_VALUE;
            if(l1 <= r2 && l2 <= r1){
                if(n % 2 == 1) 
                    return Math.max(l1, l2);
                return ((Math.max(l1, l2) + Math.min(r1, r2)) / 2.0);
            } else if(l1 > r2) 
                end = mid1 - 1;
            else 
                start = mid1 + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
