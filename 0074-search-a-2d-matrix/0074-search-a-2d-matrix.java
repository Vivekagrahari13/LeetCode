class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            int l=0,h=matrix[0].length-1;
            while(l<=h)
            {
                
                int mid=l+(h-l)/2;
                if(matrix[i][mid]==target)
                    return true;
                else if(matrix[i][mid]>target)
                    h=mid-1;
                else
                    l=mid+1;
            }
        }
        return false;
    }
}