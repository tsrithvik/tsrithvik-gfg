//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static Long reversedBits(Long x) {
        // code here
        long[] bits= new long[32];
        //if(x==0) return 0;
        Arrays.fill(bits,0);
        int b=0;
        while(x>0){
            bits[b++]= x%2;
            x/=2;
        }
        long[] revbits= new long[32];
        int k=bits.length-1;
        for(int i=0;i<32;i++){
            revbits[i]= bits[k];
            k--;
        }
        long ans=0;
        for(int i=0;i<32;i++){
            ans+= revbits[i]*(long)Math.pow(2,i);
        }
        return ans;
    }
};