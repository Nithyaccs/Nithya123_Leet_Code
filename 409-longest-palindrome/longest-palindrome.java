class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<>();
        int count=0;
        /*
        bcdabc
        cc
        bb
        cac
        bab
        bcabc
        cbabc
        cbdbc
        bcdbc
        */
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
            {
                set.remove(c);
                count+=2;
            }
            else
            {
                set.add(c);
            }
        }
        if(set.isEmpty())
        {
            return count;
        }
        else{
            return count+1;
        }
    }
}