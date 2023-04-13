class Solution {
    public String removeStars(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        int i=0;
        while(i<s.length())
        {
            char x=s.charAt(i);
            if(x!='*')
            {
                stack.push(x);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            i++;
        }
        String left="";
        for(Character c: stack)
        {
            left=c+left;
        }
        return left;
    }
}