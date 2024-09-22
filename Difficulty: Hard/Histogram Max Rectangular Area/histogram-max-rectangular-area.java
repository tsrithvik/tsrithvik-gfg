//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[(int)n];
            for (int i = 0; i < n; i++) arr[i] = Long.parseLong(inputLine[i]);
            System.out.println(new Solution().getMaxArea(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[]) {
        long n = hist.length;
        
        // Find the previous smaller and next smaller elements
        long[] ps = prevSmaller(hist, n);
        long[] ns = nextSmaller(hist, n);
        
        long max = 0;
        
        // Iterate through each bar in the histogram
        for (int i = 0; i < n; i++) {
            // Calculate width as the distance between next and previous smaller indices
            long width = ns[i] - ps[i] - 1;
            long area = width * hist[i];
            max = Math.max(max, area);
        }
        
        return max;
    }
    
    static long[] prevSmaller(long[] hist, long n) {
        long[] ps = new long[(int)n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && hist[st.peek()] >= hist[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ps[i] = -1; // No previous smaller element
            } else {
                ps[i] = st.peek();
            }
            st.push(i);
        }
        
        return ps;
    }
    
    static long[] nextSmaller(long[] hist, long n) {
        long[] ns = new long[(int)n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = (int)n - 1; i >= 0; i--) {
            while (!st.isEmpty() && hist[st.peek()] >= hist[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ns[i] = n; // No next smaller element
            } else {
                ns[i] = st.peek();
            }
            st.push(i);
        }
        
        return ns;
    }

}
