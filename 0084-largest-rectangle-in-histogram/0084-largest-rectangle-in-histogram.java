class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0,n=heights.length;
        Deque<Integer> stack=new ArrayDeque<>();
        int ps[]=new int[n];
        int ns[]=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i])
            {
                stack.pop();
            }
            ps[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            {
                stack.pop();
            }
            ns[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        for(int i=0;i<n;i++)
        {
            int curr=heights[i];
            curr=curr+curr*(i-ps[i]-1)+curr*(ns[i]-i-1);
            area=Math.max(curr,area);
        }
        return area;
    }
}