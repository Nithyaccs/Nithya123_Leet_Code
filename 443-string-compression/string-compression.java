class Solution {
    public int compress(char[] chars) {
        int write=0;
        int i=0;
        while(i<chars.length){
            char c=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==c)
            {
                i++;
                count++;
            }
            chars[write]=c;
            write++;
            if(count>1)
            {
                String num=String.valueOf(count);
                //valueOf==>change integer to string
                for(char x:num.toCharArray())
                {
                    chars[write]=x;
                    write++;
                }
            }
        }
        return write;
    }
}