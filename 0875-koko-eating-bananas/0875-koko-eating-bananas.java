class Solution 
{
    public int minEatingSpeed(int[] piles, int h)
     {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(max,piles[i]);
        }
        if(h==piles.length)
        {
            return max;
        }
        int low=1,high=max;
        int res=Integer.MAX_VALUE;
        while(low<high)
        {
            int k=(high+low)/2;
            if(eatSpeed(piles,h,k))
            {
                //res=k;
                high=k;
            }
            else
            {
                low=k+1; 
            }
        }
        return low;
    }
    public static boolean eatSpeed(int[] piles,int h, int k1)
    {
        int count=0;
        for(int i=0;i<piles.length;i++)
        {
            count+=(int)Math.ceil(piles[i]*1.0/k1);
        }
        return count<=h;
    }
}