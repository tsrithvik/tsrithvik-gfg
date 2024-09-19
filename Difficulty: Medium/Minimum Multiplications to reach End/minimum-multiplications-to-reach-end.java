//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        if(start==end) return 0;
        Queue<Node> q= new LinkedList<>();
        q.add(new Node(start, 0));
        int ans=0;
        int mod= 100000;
        int[] dp= new int[100000]; //to note distance of that particular value
        //the value might occur multiple times with diff distances
        dp[start]= 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        while(!q.isEmpty()){
            Node n= q.poll();
            int d= n.dist;
            int v= n.val;
            
            for(int i: arr){
                int num= (i*v)%mod;
                if(d+1<dp[num]){
                    dp[num] = d+1;
                    if(num==end) return dp[num];
                    q.add(new Node(num, d+1));
                }
            }
        }
        return -1;
        
    }
    class Node{
        int val;
        int dist;
        Node(int val, int dist){
            this.val= val;
            this.dist= dist;
        }
    }
}
