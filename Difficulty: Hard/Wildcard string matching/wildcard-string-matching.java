//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean match(String wild, String pattern)
    {
        // code here
        
       int s= wild.length();
       int p= pattern.length();
       return solve(wild, pattern, s-1, p-1);
        
    }
    
    static boolean solve(String wild, String patt, int i, int j){
        
        //checking the conditions
         if(i<0 && j>=0){
            return false;
        }
        if(i<0 && j<0){
            return true;
        }
        if(j<0 && i>=0){
            for(int k=0;k<=i;k++){
                if(wild.charAt(k)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(wild.charAt(i)==patt.charAt(j) || wild.charAt(i)=='?'){
            return solve(wild, patt, i-1, j-1);
        }
        if(wild.charAt(i)=='*'){
            return solve(wild, patt, i-1, j) || solve(wild, patt, i, j-1);
        }
        return false;
    }
}