class Solution {
    public String reverseWords(String s) {
        StringBuilder a = new StringBuilder();
        for (String w : s.split(" +"))
            a.insert(0, w + " ");
        return a.toString().trim();
    }
}