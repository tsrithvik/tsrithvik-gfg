//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        int n= S.length();
        int start=0,max=1;
        boolean[][] dp= new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(S.charAt(i)==S.charAt(j)){
                    if(j-i==1){
                        dp[i][j]= true;
                    }
                    else dp[i][j]= dp[i+1][j-1];
                }
                if(dp[i][j] && j-i+1>=max){
                    start= i;
                    max= j - i + 1;
                }
            }
        }
        return S.substring(start, max+start);
    }
}