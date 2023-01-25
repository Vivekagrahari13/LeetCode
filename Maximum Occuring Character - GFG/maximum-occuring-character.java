//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        char [] c=line.toCharArray();
        for(Character x:c)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        char freq=' ';
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue()>max)
            {
                freq=' ';
                freq=e.getKey();
                max=e.getValue();
            }
            else if(e.getValue()==max)
            {
                freq=(char)Math.min(freq,e.getKey());
            }
        }
        return freq;
    }
    
}