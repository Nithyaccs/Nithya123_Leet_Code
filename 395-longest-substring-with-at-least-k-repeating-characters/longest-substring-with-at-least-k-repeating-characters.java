class Solution {
    public int longestSubstring(String s, int k) {

        int maxLen = 0;

        for (int target = 1; target <= 26; target++) {

            int[] freq = new int[26];
            int left = 0;
            int unique = 0;
            int valid = 0;

            for (int right = 0; right < s.length(); right++) {

                int index = s.charAt(right) - 'a';

                if (freq[index] == 0)
                    unique++;

                freq[index]++;

                if (freq[index] == k)
                    valid++;

                while (unique > target) {

                    int leftIndex = s.charAt(left) - 'a';

                    if (freq[leftIndex] == k)
                        valid--;

                    freq[leftIndex]--;

                    if (freq[leftIndex] == 0)
                        unique--;

                    left++;
                }

                if (unique == target && valid == unique) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }
        }

        return maxLen;
    }
}