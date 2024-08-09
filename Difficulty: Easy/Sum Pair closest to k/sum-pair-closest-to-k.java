//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
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

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int[] ans = ob.sumClosest(arr, k);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int k) {
        // code here
        int[] ans= new int[2];
        int n= arr.length;
        int i=0, j=n-1;
        int min= Integer.MAX_VALUE;
        while(i<j){
            int sum= arr[j]+ arr[i];
            int diff= Math.abs(sum-k);
            if(diff< min){
                min= diff;
                ans[0] = arr[i];
                ans[1] = arr[j];
                
            }   
            if(sum>k) j--;
            else i++;
            
        }
        
        return ans;
    }
}