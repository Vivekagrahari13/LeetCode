class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        int i=0;
        while(i<tokens.length)
        {
             //char x=tokens[i].charAt(0);
            char x=tokens[i].charAt(tokens[i].length()-1);
            if(isOperand(x))
            {
                int num=Integer.parseInt(tokens[i]);
                stack.push(num);
            }
            else 
            {
                int op1=stack.pop();
                int op2=stack.pop();
                
                 if(x=='*')
                 {
                    stack.push(op2*op1);
                }
                else if(x=='/')
                {
                    stack.push(op2/op1);
                }
                else if(x=='+')
                {
                    stack.push(op2+op1);
                }
                else if(x=='-')
                {
                    stack.push(op2-op1);
                }
            }
            i++;
        }
        return stack.peek();
    }
    public boolean isOperand(char num)
    {
        return Character.isDigit(num);
    }
}