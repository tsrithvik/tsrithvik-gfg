//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        
        StringBuilder a= new StringBuilder();
        
        int n1= A.length();
        int n2= B.length();
        int i=0, ans=-1;
        
        while(n1<n2){
          a.append(A);
          i++;
          n1= a.toString().length();
        }
        int j=i+5;
        while(i<j){
          //System.out.println(a);
            
            
            if(a.indexOf(B)!=-1){
                ans= i;
                break;
            }
            a.append(A);
            i++;
        }
        return ans;
        
    }
};