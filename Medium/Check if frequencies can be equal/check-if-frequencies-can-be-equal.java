//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
       int freq[]=new int[26];
        int size=0,minFreq=Integer.MAX_VALUE;
        
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
             size+=freq[i];    
             minFreq=Math.min(minFreq,freq[i]);
            } 
        }
        
        int minCount=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]==minFreq)
            {
                minCount+=minFreq;
            }
        }
        
        int c=0,flag=0;
        
        if(size==minCount || size-1==minCount+minFreq)
         return true;
        else if(minFreq==1)
        {
            for(int i=0;i<26;i++)
            {
                if(freq[i]!=1 && freq[i]!=0)
                {
                  if(flag==0)
                  {
                    c=freq[i];
                    flag=1;
                  } 
                  else
                  {
                      if(freq[i]!=c)
                       return false;
                  }
                }
            }
            return true;
        }
         return false;
    }
}