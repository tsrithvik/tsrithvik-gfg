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
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        // code here
        int i=0,j=1,k=1,cnt=0,n=s.length();
        while(i<n-1 && j<n){
            if(s.charAt(i)==s.charAt(j)){
                cnt++;
                i++;
                j++;
            }
            else {
                i=0;
                k++;
                cnt=0;
                j=k;
            }
        }
        return cnt;
    }
}