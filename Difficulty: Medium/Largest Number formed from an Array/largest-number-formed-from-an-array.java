//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(n, arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        
        String[] s= new String[n];
        for(int i=0;i<n;i++){
            s[i]= String.valueOf(arr[i]);
        }
        
        Arrays.sort(s, (a,b)-> (b+a).compareTo(a+b));
        
        StringBuilder ans= new StringBuilder();
        
        for(String c: s) ans.append(c);
        
        return (ans.charAt(0)=='0') ? "0" : ans.toString();
        
    }
}