//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String str1, String str2) {
        // Code here
        //extension for LCS problem
        //fill the last row an column with decrementing values of 
        //size then move from bottom to the top.
        int n= str1.length();
        int m= str2.length();
        int[][] dp= new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][m]= n-i;
        }
        for(int j=0;j<=m;j++){
            dp[n][j]= m-j;
        }
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(str1.charAt(i)==str2.charAt(j)){
                    dp[i][j]= dp[i+1][j+1];
                }
                else{
                    dp[i][j]= 1+ Math.min(dp[i+1][j], 
                            Math.min(dp[i][j+1], dp[i+1][j+1]));
                }
                
            }
        }
        
        return dp[0][0];
    }
}