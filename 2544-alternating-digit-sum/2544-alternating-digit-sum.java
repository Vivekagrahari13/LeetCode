class Solution {
    public int alternateDigitSum(int n) {
        String num=""+n;
        int sum=0,i=0;
        while(i<num.length())
        {
            if(i%2==0)
            {
                sum+=Integer.parseInt(""+num.charAt(i));
            }
            else
            {
                sum-=Integer.parseInt(""+num.charAt(i));
            }
            i++;
        }
        return sum;
    }
}