class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray())
            freq[c]++;

        StringBuilder ans = new StringBuilder();

        for (int f = s.length(); f >= 1; f--) {
            for (char c = 0; c < 128; c++) {
                if (freq[c] == f) {
                    for (int i = 0; i < f; i++)
                        ans.append(c);
                }
            }
        }

        return ans.toString();
    }
}