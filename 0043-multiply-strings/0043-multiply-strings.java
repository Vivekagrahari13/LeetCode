class Solution {
    public String multiply(String num1, String num2)
    {
        if(num1.equals("0") || num2.equals("0") ) return "0";
        int i=num2.length()-1;
        int carry=0;
        String app="";
        String car="";
        String ans="";
        while(i>=0)
        {
            int s=(i>=0)?num2.charAt(i)-'0':0;
            int j=num1.length()-1;
            while(j>=0 || carry!=0)
            {
                int f=(j>=0)?num1.charAt(j)-'0':0;
                int currval=f*s+carry;
                app=(currval)%10+app;
                carry=(currval)/10;
                j--;
            }
            i--;
            String sum1=app+car;
            car=car+0;
            app="";
            ans=Add(sum1,ans);
        }
        return ans;
    }
    
    public String Add(String num1, String num2)
    {
        String sum="";
        int p1=num1.length()-1;
        int p2=num2.length()-1;
        int carry=0;
        
        //Now we will traverse from |num1-1| to 0 and |num2-2| to 0 and update carry
        
        while(p1>=0 || p2>=0 || carry!=0)
        {
           int first_value=(p1>=0)?num1.charAt(p1)-'0':0; 
           int sec_value=(p2>=0)?num2.charAt(p2)-'0':0; 
            
            int curr_sum=first_value+sec_value+carry;
            // append curr_sum to sum and update sum for each traversal
            sum=curr_sum%10+sum;
            carry=curr_sum/10;
            
            p1--;
            p2--;
        }
        return sum;
}
}