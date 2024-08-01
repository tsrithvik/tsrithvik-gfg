//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String S, int K) {
        // your code here
        
        return helper(S, K);
    }
    static long helper(String S, int K){
        int i=0, j=0;
        long  ans=0;
        int n= S.length();
        int dc=0;
        int[] freq= new int[26];
        
        while(j<n){
            freq[S.charAt(j)-'a']++;
            if(freq[S.charAt(j)-'a']==1) dc++;
            
            while(dc>K){
                freq[S.charAt(i)-'a']--;
                if(freq[S.charAt(i)-'a']==0) dc--;
                i++;
            }
            j++;
            ans+= (j-i+1);
            
        }
        
        return ans;
    }
}