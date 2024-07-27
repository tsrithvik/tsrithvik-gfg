//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        
        HashMap<Character, Integer> map= new HashMap<>();
        s= s.toLowerCase();
        for(int i=0;i<s.length();i++){
          char c= s.charAt(i);
          int alp= (c- 'a');
          if(c>64 && c<123)
            map.put(c, map.getOrDefault(c, 0)+1); 
        }
        //System.out.print(map);
        
        int cnt=0;
        for(int i=0;i<26;i++){
           char alp= (char)(i+'a');
           if(map.containsKey(alp)) cnt++;
        }
        
        
        return (cnt>=26) ? true : false;
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends