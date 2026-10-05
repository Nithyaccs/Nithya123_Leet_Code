import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        char a[] = pattern.toCharArray();
        String b[] = s.split(" ");

        // Lengths must be equal
        if (a.length != b.length) {
            return false;
        }

        HashMap<Character, String> c = new HashMap<>();
        HashMap<String, Character> d = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            char ch = a[i];
            String word = b[i];

            // Check character -> word
            if (c.containsKey(ch) && !c.get(ch).equals(word)) {
                return false;
            }

            // Check word -> character
            if (d.containsKey(word) && d.get(word) != ch) {
                return false;
            }

            c.put(ch, word);
            d.put(word, ch);
        }

        return true;
    }
}