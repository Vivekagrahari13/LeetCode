class Solution {
    public int maxPower(String s) 
    {
        //char [] ch=s.toCharArray();
        //Arrays.sort(ch);
        int max=1;
        int curr=1;
        for(int i=1;i<s.length();i++)
        {
            // if(ch[i]==ch[i-1])
            if(s.charAt(i)==s.charAt(i-1))
            {
                curr++;
                max=Math.max(curr,max);
            }
            else
            {
                curr=1;
            }
        }
        return max;
    }
}