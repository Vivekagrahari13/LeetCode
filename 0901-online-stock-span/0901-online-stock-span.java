class StockSpanner 
{
    Deque<Node>stack;
    public StockSpanner() 
    {
        stack=new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span=0;
        while(stack.isEmpty()==false && stack.peek().val<=price)
        {
            span+=stack.peek().del;
            stack.pop();
        }
        span++;
        stack.push(new Node(price, span));
        return span;
    }
    class Node{
        int val;
        int del;
        public Node(int val, int del){
            this.val=val;
            this.del=del;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */