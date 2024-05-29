//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();
            obj.segregateElements(a, n);

            for (int i = 0; i < n; i++) ot.print(a[i] + " ");

            ot.println();
        }
        ot.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public void segregateElements(int arr[], int n) {
        // Your code goes here
        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0) al1.add(arr[i]);
            else al2.add(arr[i]);
        }
        int k=0;
        for(int i=0;i<al1.size();i++){
            arr[k++]= al1.get(i);
        }
        for(int i=0;i<al2.size();i++){
            arr[k++]= al2.get(i);
        }
    }
}