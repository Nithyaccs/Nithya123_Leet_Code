
class Solution {
    public int takeCharacters(String s, int k) {
        /*
        aabaaaacaabc
        */
        int n=s.length();
        int []count=new int[3];
        for(char c:s.toCharArray())
        {
            count[c-'a']++;
        }
        if(count[0]<k||count[1]<k||count[2]<k)
        {
            return -1;
        }
        int l=0;
        int ans=0;
        int []window=new int[3];
        for(int r=0;r<n;r++){
            window[s.charAt(r)-'a']++;
            while(
            window[0]>count[0]-k||
            window[1]>count[1]-k||
            window[2]>count[2]-k)
            {
                window[s.charAt(l)-'a']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return n-ans;
    }
}