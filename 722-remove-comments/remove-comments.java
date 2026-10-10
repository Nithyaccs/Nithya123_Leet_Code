
import java.util.*;

class Solution {
    public List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        boolean inBlock = false;

        for (String s : source) {
            int i = 0;

            while (i < s.length()) {

                // Inside a block comment
                if (inBlock) {
                    if (i + 1 < s.length()
                            && s.charAt(i) == '*'
                            && s.charAt(i + 1) == '/') {
                        inBlock = false;
                        i += 2;
                    } else {
                        i++;
                    }
                }

                // Start of a block comment
                else if (i + 1 < s.length()
                        && s.charAt(i) == '/'
                        && s.charAt(i + 1) == '*') {
                    inBlock = true;
                    i += 2;
                }

                // Start of a line comment
                else if (i + 1 < s.length()
                        && s.charAt(i) == '/'
                        && s.charAt(i + 1) == '/') {
                    break;
                }

                // Normal character
                else {
                    line.append(s.charAt(i));
                    i++;
                }
            }

            // Save the line only if not inside a block comment
            if (!inBlock) {
                if (line.length() > 0) {
                    result.add(line.toString());
                }
                line.setLength(0);
            }
        }

        return result;
    }
}