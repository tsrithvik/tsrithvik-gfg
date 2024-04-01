//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character, Integer> al= new LinkedHashMap();
        for(int i=0;i<S.length();i++){
            if(!al.containsKey(S.charAt(i))) al.put(S.charAt(i),1);
            else al.put(S.charAt(i),al.get(S.charAt(i))+1);
        }
        for (char c : al.keySet()) {
            if (al.get(c) == 1) {
                return c;
            }
        }
        //if(al.size()==0) return '$';
        //return al.getKey(0);
        return '$';
    }
}

