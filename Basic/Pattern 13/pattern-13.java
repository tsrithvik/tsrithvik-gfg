//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


// Back-end complete function Template for Java

class Solution {

    void printTriangle(int n) {
        
        int i=0,j=0,k=1;
		for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            
        }
    }
}