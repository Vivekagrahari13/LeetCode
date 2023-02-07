//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int t=0,r1=c-1,b=r-1,l=0;
        while(t<=b && l<=r1)
        {
            for(int i=t;i<=r1;i++)
            {
                list.add(matrix[t][i]);
            }
            t++;
            
            for(int i=t;i<=b;i++)
            {
                list.add(matrix[i][r1]);
            }
            r1--;
            
            if(t<=b)
            {
                for(int i=r1;i>=l;i--)
                {
                    list.add(matrix[b][i]);
                }
                b--;
            }
            
            if(l<=r1)
            {
                for(int i=b;i>=t;i--)
                {
                    list.add(matrix[i][l]);
                }
                l++;
            }
            
        }
        return list;
    }
}
