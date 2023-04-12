class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        Deque<Integer> stack=new ArrayDeque<>();
        int i=1,len=target.length;
        int size=0;
        while(i<=n)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                list.add("Push");
                size++;
            }
            else
            {
                if(target[len-1]==stack.peek())
                {
                    break;
                }
               if(size==len || target[size-1]!=stack.peek())
                {
                    stack.pop();
                    list.add("Pop");
                    size--;
                    i--;
                }
                else
                {  
                stack.push(i);
                list.add("Push");
                size++;
                }
            }
            i++;
        }
        return list;
    }
}