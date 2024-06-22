//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    static int mod= 1000000007;
    long countWays(int n,int k)
    {
        //code here.
        return solve(n, k);
    }
    static long add(long a , long b){
        return (a%mod + b%mod)%mod;
    }
    static long mul(long a, long b){
        return ((a%mod)* (b%mod))%mod;
    }
    static long solve(int n, int k){
        if(n==1) return k;
        
        if(n==2){
            return add(k, mul(k, k-1));
        }
        
        long[] dp= new long[n+1];
        //Arrays.fill(dp,0);
        
        //if(dp[n]!= -1) return dp[n];
        
        //long a= mul(solve(n-1, k), (k-1));
        //long b= mul(solve(n-2, k), (k-1));
        
        dp[1]= k;
        dp[2] = add(k, mul(k, k-1));
        
        for(int j=3;j<=n;j++){
            dp[j]= add(mul(dp[j-2], k-1), mul(dp[j-1], k-1));
        }
        
        //dp[n]= add(a, b);
        return dp[n];
    }
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            //int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);

            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.countWays(n,k);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends