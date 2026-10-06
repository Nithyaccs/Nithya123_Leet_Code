class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new HashMap<>();
        /*
        tree
        t,r,e,e
        key->value
        t->0+1
        r->0+1
        e->0+1
        e->1+1
        */
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        /* t,r,e
        t e r
        e t r
        */
        List<Character> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));//lambda function
        String a="";
        for(char c:list)
        {
            for(int i=0;i<map.get(c);i++)
            {
                a+=c;
            }
        }
        return a;
    }
}