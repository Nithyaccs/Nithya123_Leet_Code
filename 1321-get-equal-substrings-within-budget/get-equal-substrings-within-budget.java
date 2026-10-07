class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int cost[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int sum=0;
        int l=0;
        int ans=0;
        for(int r=0;r<cost.length;r++)
        {
            sum+=cost[r];
            if(sum>maxCost)
            {
                sum-=cost[l];
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}