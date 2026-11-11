package ArrayString;

class Solution {
    public int majorityElement(int[] nums) {
        int major = 0, cnt = 0;

        for (int num : nums) {
            if (cnt == 0) major = num;

            if (major == num) cnt++;
            else cnt--;
        }
        return major;
    }
}
