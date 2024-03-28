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
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.closestNumber(N,M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int closestNumber(int N , int M) {
        // code here
       int rem=N%M;
        if(rem==0) return N;
        
        int i=N,j=N;// two variable for forward and backward 
        while(true){
            if(i%M==0)
                return i;
                 i--;//else go backward -ve side
            if(j%M==0)
                return j;
                 j++;    //else go forward +ve side
        }
    }
};