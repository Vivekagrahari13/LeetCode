class Solution 
{
    public char repeatedCharacter(String s) 
    {
       LinkedHashMap<Character ,Integer> map=new LinkedHashMap<>();
        //char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.containsValue(2))
            {
                return s.charAt(i);
            }
        } 
        return ' ';
    }
}