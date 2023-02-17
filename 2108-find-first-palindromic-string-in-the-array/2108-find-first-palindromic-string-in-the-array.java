class Solution {
    public String firstPalindrome(String[] words) 
    {
        for(String a:words)
        {
            if(isPalindrome(a))
            {
                return a;
            }
        }
        return "";
    }
    static boolean isPalindrome(String s)
    {
        String str= "";
        for(int i = s.length()-1 ;i>=0 ;i--){
            str +=s.charAt(i);
        }
        return str.equals(s);
    }
}