package ArrayString;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = n - 1, j = m - 1 , k = (m + n - 1);

        while (i >= 0 && j >= 0) {
            if (nums2[i] >= nums1[j]) {
                swap(i, k, nums2, nums1);
                i--;
            }
            else {
                swap(j, k, nums1, nums1);
                j--;
            }
            k--;
        }

        while (i >= 0) {
            swap(i, k, nums2, nums1);
            i--;
            k--;
        }
    }

    private void swap(int i, int j, int[] nums1, int[] nums2) {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }
}