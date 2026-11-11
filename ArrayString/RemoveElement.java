package ArrayString;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1, k = 0;
        Arrays.sort(nums);

        while (i <= j) {
            if (nums[i] == val) {
                swap(i, j, nums);
                j--;
            }
            else  {
                k++;
                i++;
            }
        }
        return k;
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
