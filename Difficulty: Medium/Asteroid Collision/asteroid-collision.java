//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] arr) {
        // code here
        
        Stack<Integer> st= new Stack<>();
        //st.push(arr[0]);
        //int top=1;
       for(int i=0;i<N;i++){
           boolean flag= true;
           
           while(!st.isEmpty() && st.peek()>0 && arr[i]<0){
               int top= st.peek();
               if(Math.abs(top)< Math.abs(arr[i])){
                   st.pop();
                   continue;
               }
               else if(Math.abs(top)== Math.abs(arr[i])){
                   st.pop();
                    
               }
                   flag= false;
                   break;
               
           }
           if(flag) st.push(arr[i]);
       }
        
        int l = st.size();
        int[] ans = new int[l];
        for (int i = l - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
