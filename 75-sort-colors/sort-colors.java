class Solution {
    public void sortColors(int[] nums) {
        int count=0,count1=0,count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)count++;
            else if(nums[i]==1)count1++;
            else count2++;
        }
        int i=0;
        while(count-->0)nums[i++]=0;
        while(count1-->0)nums[i++]=1;
        while(count2-->0)nums[i++]=2;
    }
}