class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                int a = i + 1, b = j, c = i, d = j - 1;

                while (a < b && s.charAt(a) == s.charAt(b)) { a++; b--; }
                if (a >= b) return true;

                while (c < d && s.charAt(c) == s.charAt(d)) { c++; d--; }
                return c >= d;
            }
            i++;
            j--;
        }
        return true;
    }
}