class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int a[]=new int[m+n];
       int k=0;
       for(int i=0;i<m;i++)
       {
        a[k++]=nums1[i];
       } 
       for(int j=0;j<n;j++)
       {
        a[k++]=nums2[j];
       }
       for(int i=0;i<k;i++)
       {
        nums1[i]=a[i];
       }
       Arrays.sort(nums1);
    }
}