//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.areRotations(s1,s2))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends



class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
       StringBuilder st=new StringBuilder();
            st.append(s1);
            st.append(s1);
            return st.lastIndexOf(s2)>=0?true:false;
        //return false;
    }
    /*int n= s1.length();
        ;
        int start=0, end=n;
        while(start<n){
           // String p= ;
            if(s.substring(start, end).equals(s2)) return true;
            start++;
            end++;
            //if(start== n-1) return false;
        }
        return false;
    String str1= "";
            String str2= ""; 
            str1= leftrotate(s1, i);
            str2= rightrotate(s1, i);
            if(str2==s2) return true;
            if(str1==s2) return true;
    static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
    static String rightrotate(String str, int d)
    {
            return leftrotate(str, str.length() - d);
    }
    */
}