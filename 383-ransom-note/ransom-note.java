class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []c=new int[26];
        for(char d:magazine.toCharArray())
        {
            c[d-'a']++;
        }
        for(char d:ransomNote.toCharArray())
        {
            if(--c[d-'a']<0)
            {
                return false;
            }
        }
        return true;
    }
}