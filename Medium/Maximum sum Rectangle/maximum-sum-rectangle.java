//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here
      int[] sum= new int[R];
      int maxSum= Integer.MIN_VALUE;
      for(int cs=0;cs<C;cs++){
          Arrays.fill(sum, 0);
          for(int ce= cs;ce<C;ce++){
              for(int row=0;row<R;row++){
                  sum[row]+= M[row][ce];
              }
              int curMaxSum = kadane(sum);
              maxSum= Math.max(curMaxSum, maxSum);
          }
      }
      return maxSum;
    }
    static int kadane(int[] sum){
        int n= sum.length;
        int c= sum[0];
        int g= sum[0];
        for(int i=1;i<n;i++){
            c= Math.max(c+sum[i], sum[i]);
            g= Math.max(c, g);
        }
        return g;
    }
};