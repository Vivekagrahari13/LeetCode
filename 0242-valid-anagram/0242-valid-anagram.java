class Solution {
    static final int CHAR=256;
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int ch[]=new int[CHAR];
        for(int i=0;i<s.length();i++)
        {
            ch[s.charAt(i)]++;
            ch[t.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++)
        {
            if(ch[i]!=0)
                return false;
        }
        return true;
    }
}