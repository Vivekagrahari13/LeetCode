class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                mat[i][j]=Integer.parseInt(""+matrix[i][j]);
            }
        }
        
        int area=larHistoRect(mat[0],c);
            for(int i=1;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(mat[i][j]==1)
                    {
                        mat[i][j]+=mat[i-1][j];
                    }
                }
                area=Math.max(area, larHistoRect(mat[i],c));
                }
                              return area;
    }
    public int larHistoRect(int a[], int n)
    {
        Deque<Integer> stack=new ArrayDeque<>();
        int area=0;
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && a[stack.peek()]>=a[i])
            {
                int top=stack.peek();
                stack.pop();
                int res=(a[top])*(stack.isEmpty()?i:(i-stack.peek()-1));
                area=Math.max(res,area);
            }
            stack.push(i);
        }
        while(!stack.isEmpty() )
            {
                int top=stack.peek();
                stack.pop();
                int res=(a[top])*(stack.isEmpty()?n:n-stack.peek()-1);
                area=Math.max(res,area);
            }
        return area;
    }
    }
