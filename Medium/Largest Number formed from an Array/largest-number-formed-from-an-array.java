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
        //String currentlargearr[0],largest=arr[n-1];
        Arrays.sort(arr, new Comparator<String>() {
            //@Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab); // Compare as strings
            }
        });

        StringBuilder largestNumber = new StringBuilder();
        for (String s : arr) {
            largestNumber.append(s);
        }
        String s= largestNumber.toString();
        return s;
    }
    
}


/*String s= "";
         for(int i=0;i<n;i++){
            s+=arr[i];
          }
          */
          