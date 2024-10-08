//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long returnMaxSum(long A[], long B[],int N)
    {
        // Your code geos here
       HashSet<Long> set= new HashSet<>();
        
        int i=0,j=0;
        long sum=0, ans=0;
        while(i<N){
            if(j!=N && !set.contains(A[j])){
                set.add(A[j]);
                sum+= B[j];
                j++;
            }
            else{
                i++;
                j= i;
                ans= Math.max(sum, ans);
                set.clear();
                sum=0;
            }
        }
        return ans;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int m =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
    //        int k = Integer.parseInt(br.readLine());
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[n];
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            long ans=ob.returnMaxSum(a,b,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends