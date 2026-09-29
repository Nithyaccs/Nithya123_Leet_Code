
    class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        // Find total sum
        for (int num : nums) {
            total += num;
        }

        int left = 0;
        int right = total;
        int i = 0;

        while (i < nums.length) {
            // Remove current element from right
            right -= nums[i];

            // Check pivot
            if (left == right) {
                return i;
            }

            // Add current element to left
            left += nums[i];

            i++;
        }

        return -1;
    }
}
