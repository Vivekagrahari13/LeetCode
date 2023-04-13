class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        Deque<Integer> stack=new ArrayDeque<>();
        //stack.push(pushed[0]);
        int i=0,j=0,n=pushed.length;
        while(i<n)
        {
            stack.push(pushed[i]);
            i++;
            while( (stack.isEmpty()==false&& j<n) && popped[j]==stack.peek())
            {
                stack.pop();
                j++;
            }
            
        }
        return stack.isEmpty();
    }
}