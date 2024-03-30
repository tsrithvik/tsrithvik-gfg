//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here

        int minDistance = Integer.MAX_VALUE;
        int lastSeen = -1;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y) {
                if (lastSeen != -1 && a[i] != a[lastSeen]) {
                    minDistance = Math.min(minDistance, i - lastSeen);
                }
                lastSeen = i;
            }
        }

        // Check if both elements are found in the array
        if (minDistance == Integer.MAX_VALUE) {
            return -1; // One or both elements not found
        }
        
        return minDistance;

    }
}