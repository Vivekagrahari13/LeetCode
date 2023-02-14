class Solution {
    public String addBinary(String a, String b) 
    {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String sum="";
        while(i>=0 || j>=0 || carry!=0)
        {
            int f=(i>=0)?a.charAt(i)-'0':0;
            int g=(j>=0)?b.charAt(j)-'0':0;
            int curr_sum=f+g+carry;
            if(curr_sum==3)
            {
                sum=1+sum;
                carry=1;
            }
            else if(curr_sum==2)
            {
                sum=0+sum;
                carry=1;
            }
            else if(curr_sum==1)
            {
                sum=1+sum;
                carry=0;
            }
            else
            {
                sum=0+sum;
                carry=0;
            }
            i--;
            j--;
        }
        return sum;
    }
}