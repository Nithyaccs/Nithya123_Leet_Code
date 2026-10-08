class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        int l=0;
        for(char b:s.toCharArray())
        {
            if(b=='A')a++;
            if(b=='L')l++;
            else l=0;
            if(a>=2||l>=3)
            return false;
        }
        return true;
    }
}