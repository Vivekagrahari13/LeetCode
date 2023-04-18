class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int i=0, j=0;
        while(i<word1.length() && j<word2.length())
        {
            // char a=(i<word1.length())?word1.charAt(i):' ';
            // char b=(j<word2.length())?word2.charAt(j):' ';
            s=s+word1.charAt(i)+word2.charAt(j);
            i++;j++;
        }
        if(i<word1.length())
        {
            s=s+word1.substring(i,word1.length());
        }
        if(j<word2.length())
        {
            s=s+word2.substring(j,word2.length());
        }
        return s;
    }
}