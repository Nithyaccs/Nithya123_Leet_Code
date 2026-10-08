class Solution {
    public String reversePrefix(String word, char ch) {
        int d=word.indexOf(ch);
        if(d==-1)
        {
            return word;
        }
        int l=0;
        int r=d;
        char a[]=word.toCharArray();
        while(l<r)
        {
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
            }
            return new String(a);

    }
}