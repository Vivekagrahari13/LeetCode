class Solution 
{
    public char repeatedCharacter(String s) 
    {
       LinkedHashMap<Character ,Integer> map=new LinkedHashMap<>();
        char ch[]=s.toCharArray();
        for(Character x:ch)
        {
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.containsValue(2))
            {
                return x;
            }
        }
        /*for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue()==2)
            {
                return e.getKey();
            }
        }*/
        return ' ';
    }
}