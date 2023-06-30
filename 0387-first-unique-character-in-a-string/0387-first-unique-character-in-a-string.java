class Solution {
    static final int CHAR=256;
    public int firstUniqChar(String s) {
        int n=s.length();
        int ch[]=new int[CHAR];
        for(int i=0;i<n;i++)
        {
            ch[s.charAt(i)]++;
        }
        for(int i=0;i<n;i++)
        {
            if(ch[s.charAt(i)]==1)
                return i;
        }
        return -1;
    }
    
}