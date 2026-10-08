class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        for(char a:word.toCharArray())
        {
            if(Character.isUpperCase(a))
            {
                c++;
            }
        }
        return c==word.length()||c==0||
        (c==1&&Character.isUpperCase(word.charAt(0)));
    }
}