class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    int atMost(int[] nums, int k) {

        if (k < 0)
            return 0;

        int left = 0;
        int count = 0;
        int oddCount = 0;

        for (int right = 0; right < nums.length; right++) {

            // Count odd numbers
            if (nums[right] % 2 == 1) {
                oddCount++;
            }

            // Too many odd numbers
            while (oddCount > k) {
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }

                left++;
            }

            // Number of valid subarrays ending at right
            count += right - left + 1;
        }

        return count;
    }
}