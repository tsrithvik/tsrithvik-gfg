//{ Driver Code Starts
// Initial Template for Java
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            long N = Long.parseLong(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.countStrings(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int mod= (int)Math.pow(10,9)+7;
    public int countStrings(long N) {
        // Code here
        return (int)fib(N+2)%mod;
    }
    public static long fib(long n){
        long[][] f= new long[][]{{1,1},{1,0}};
        if (n==0) return 0;
        
        power(f, n-1);
        return f[0][0];
    }
    public static void power(long[][] f, long n){
        if(n==0 || n==1) return;
        long[][] m= new long[][]{{1,1},{1,0}};
        power(f, n/2);
        multiply(f,f);
        if(n%2!=0) multiply(f,m);
        
    }
    public static void multiply(long[][] f, long[][] m){
        long x1= (f[0][0]%mod * m[0][0]%mod)+(f[0][1]%mod * m[1][0]%mod)%mod;
        long y1= (f[0][0]%mod * m[0][1]%mod)+(f[0][1]%mod * m[1][1]%mod)%mod;
        long x2= (f[1][0]%mod * m[0][0]%mod)+(f[1][1]%mod * m[1][0]%mod)%mod;
        long y2= (f[1][0]%mod * m[0][1]%mod)+(f[1][1]%mod * m[1][1]%mod)%mod;
        
        f[0][0]= x1;
        f[0][1]= y1;
        f[1][0]= x2;
        f[1][1]= y2;
        
    }
}