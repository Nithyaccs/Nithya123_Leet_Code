import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> a=new HashMap<>();
        HashMap<Character,Character> b=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(a.containsKey(c)&&a.get(c)!=d)
            {
                return false;
            }
            if(b.containsKey(d)&&b.get(d)!=c)
            {
                return false;
            }
            a.put(c,d);
            b.put(d,c);
        }
        return true;
    }
}