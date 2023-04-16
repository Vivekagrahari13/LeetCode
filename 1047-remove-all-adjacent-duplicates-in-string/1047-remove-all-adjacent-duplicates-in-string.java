class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        int i=0;
        while(i<s.length())
              {
            char x=s.charAt(i);
                  if(!stack.isEmpty() && stack.peek()==x)
                  {
                      stack.pop();
                  }
            else
                stack.push(x);
            i++;
              }
        if(stack.size()==s.length()) return s;
        // if(stack.isEmpty()) 
        //    return "";
        String s1="";
        i=0;
        while(i<stack.size())
        {
            s1=stack.peek()+s1;
            stack.pop();
            // i++;
        }
        return s1;
    }
}