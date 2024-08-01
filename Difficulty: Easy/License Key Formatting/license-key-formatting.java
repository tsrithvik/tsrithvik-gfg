//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.ReFormatString(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static String ReFormatString(String S, int K){
        // code here
        
        //if(S.length()<K && S.charAt(0)=='-') return "";
        
        StringBuilder ans= new StringBuilder();
        int c=0;
        int cnt=K;
        S= S.replace("-", "");
        S= S.toUpperCase();
        if (S.length() == 0) {
            return "";
        }
        int fst= S.length()%K;
        if(fst==0) fst=K;
        
        ans.append(S.substring(0, fst));
        
        for (int i = fst; i < S.length(); i += K) {
            ans.append('-').append(S.substring(i, i + K));
        }
        return ans.toString();
    }
}