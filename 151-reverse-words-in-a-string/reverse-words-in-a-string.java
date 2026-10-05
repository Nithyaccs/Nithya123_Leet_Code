class Solution {
    public String reverseWords(String s) {
        String c="";
        String word[]=s.split(" +");
        for(int i=word.length-1;i>=0;i--)
        {
            c+=" "+word[i];
        }
        return c.trim();
    }
}