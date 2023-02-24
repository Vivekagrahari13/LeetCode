class Solution {
    public boolean isSubsequence(String s, String t)
    {
        for (int i = 0; i < s.length(); i++) 
        {
            // i = pointer for iterating through string s
            final int indexOfCharInT = t.indexOf(s.charAt(i));
            if (indexOfCharInT == -1) 
            {
                return false;
            }
            
            t = t.substring(indexOfCharInT + 1);
        }
        return true;
}
}