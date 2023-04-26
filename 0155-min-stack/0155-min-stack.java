class MinStack 
{
        Deque<Integer> mstack;
        Deque<Integer> astack;
    public MinStack() 
    {
       mstack=new ArrayDeque<>();
       astack=new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(mstack.isEmpty())
        {
            mstack.push(val);
            astack.push(val);
            return;
        }
        
            mstack.push(val);
            if(astack.peek()>=mstack.peek())
            {
                astack.push(val);
            }
    }
    
    public void pop() {
        if(Math.abs(mstack.peek()) == Math.abs(astack.peek()))
            astack.pop();
        mstack.pop();
        System.out.println(mstack.size()+" "+astack.size());
    }
    
    public int top() {
        return mstack.peek();
    }
    
    public int getMin() {
        return astack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */