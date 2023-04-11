class Solution {
    public boolean isValid(String s)
    {
        Deque<Character>stack=new ArrayDeque<>();
		int i=0;
		while(i<s.length())
		{
			char x=s.charAt(i);
			if(x=='(' || x=='['  || x=='{')
			{
				stack.push(x);
			}
			else
			{
				if( stack.isEmpty()==true)
				{
					return false;
				}
				else if(matchBrace(stack.peek(),x)==false)
				{
					return false;
				}
				else
				{
					stack.pop();
				}
			}
			i++;
		}
		return (stack.isEmpty()==true);
    }
	static boolean matchBrace(char a, char b)
	{
		return (a=='(' && b==')')|| (a=='{'&& b=='}') ||( a=='[' && b==']');
	}
}