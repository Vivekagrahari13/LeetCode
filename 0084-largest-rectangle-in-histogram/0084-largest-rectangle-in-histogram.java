class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Deque<Integer> stack=new ArrayDeque<>();
        int area=0;
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            {
                int top=stack.peek();
                stack.pop();
                int res=(heights[top])*(stack.isEmpty()?i:(i-stack.peek()-1));
                area=Math.max(area,res);
            }
            stack.push(i);
        }
        while(!stack.isEmpty() )
            {
                int top=stack.peek();
                stack.pop();
                int res=(heights[top])*(stack.isEmpty()?n:(n-stack.peek()-1));
                area=Math.max(area,res);
            }
        return area;
    }
}