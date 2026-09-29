class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int c[]=nums.clone();
        Arrays.sort(c);
        int l=(n-1)/2;
        int r=n-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                nums[i]=c[l--];
            }
            else 
            {
                nums[i]=c[r--];
            }
        }
    }
}