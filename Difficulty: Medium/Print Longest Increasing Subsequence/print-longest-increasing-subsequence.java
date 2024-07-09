//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.longestIncreasingSubsequence(N, arr);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> longestIncreasingSubsequence(int n, int arr[]) {
        // Code here
        
        ArrayList<Integer> ans= new ArrayList<>();
        int[] dp= new int[n];
        Arrays.fill(dp, 1);
        int[] hash= new int[n];
        for(int i=0;i<n;i++){
            hash[i]= i;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && dp[i]<1+dp[j]){
                    dp[i]= 1+dp[j];
                    //ans.add(dp[j]);
                    hash[i]= j;
                }
            }
           
        }
        
        //to find the index max value and i.e., max possible length of lis
        int max=-1, index=-1;
        for(int i=0;i<n;i++){
            if(max<dp[i]){
                max= dp[i];
                index= i;
            }
        }
        
        ans.add(arr[index]);
        while(index!=hash[index]){
            index= hash[index];
            ans.add(arr[index]);
        }
        Collections.reverse(ans);
        return ans;
    }
}
