class Solution {
    public int pivotIndex(int[] nums) {
     int total=0;
     for(int n:nums)
     {
        total+=n;
     }  
     int l=0;
     int r=total;
     int i=0;
     while(i<nums.length)
     {
        r-=nums[i];
        if(l==r)
        {
            return i;
        }
        l+=nums[i];
        i++;
     }
     return -1;
    }
}