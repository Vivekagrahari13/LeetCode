class Solution {
    public int alternateDigitSum(int n) 
    {
        String s=String.valueOf(n);
        int sum=0;
        int i=0;
        while(n>0)
        {
           if(i%2==0)
           {
               sum+=(Integer.parseInt(s.charAt(i)+""));  
           }
            else
            {
                sum-=(Integer.parseInt(s.charAt(i)+""));
            }
            i++;
            n=n/10;
        }
        return sum;
    }
}