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
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.rotateMatrix(N, M, A);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int[][] rotateMatrix(int m, int n, int mat[][]) {
        // code here
        //l=r, t=c, r=mxc, b=mxr
        int c=0, r=0, mxr= m-1, mxc= n-1;
        while(c<mxc && r<mxr){
            int prev= mat[r+1][c];
            for(int i=c;i<=mxc;i++){
                int curr= mat[r][i];
                mat[r][i]= prev;
                prev= curr;
            }
            for(int i=r+1;i<=mxr;i++){
                int curr= mat[i][mxc];
                mat[i][mxc]= prev;
                prev= curr;
            }
            for(int i=mxc-1;i>=c;i--){
                int curr= mat[mxr][i];
                mat[mxr][i]= prev;
                prev= curr;
            }
            for(int i=mxr-1;i>=r;i--){
                int curr= mat[i][c];
                mat[i][c]= prev;
                prev= curr;
            }
            r++;
            c++;
            mxr--;
            mxc--;
        }
        
            
        return mat;
    }
}