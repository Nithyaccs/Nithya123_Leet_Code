class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split(" +");
        String ans = "";

        for (int i = a.length - 1; i >= 0; i--) {
            ans += a[i];
            if (i != 0) ans += " ";
        }

        return ans;
    }
}