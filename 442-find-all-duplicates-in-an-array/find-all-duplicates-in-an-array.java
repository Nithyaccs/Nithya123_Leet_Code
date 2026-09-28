class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> a=new HashSet<>();
        List <Integer> b=new LinkedList<>();
       /* 1 1 2 3 3 4 5 5
        set=>1,2,3,4,5
        list=>1,3,5*/
        for(int i:nums)
        {
            if(!a.contains(i))
            {
                a.add(i);
            }
            else
            {
                b.add(i);
            }
        }
        return b;
    }
}