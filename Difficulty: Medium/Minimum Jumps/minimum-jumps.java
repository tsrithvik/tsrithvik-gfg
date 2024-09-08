//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr) {
        // your code here
        int n= arr.length-1;
        
        if(arr[0]>=n) return 1;
        else if(arr[0]==0) return -1;
        
        int max=arr[0];
        int c=1;
        int curr=arr[0];
        
        for(int i=1;i<=n;i++){
            if(i==n) return c;
            
            max= Math.max(max, i+arr[i]);
            curr--;
            
            if(curr==0){
                if(i>=max) return -1;
                curr= max-i;
                c++;
            }
            
        }
        
        return -1;
        
    }
}