class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        s=new String(a);
        t=new String(b);
        return s.equals(t);
        
    }
}