//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        // code here
        
        Stack<Character> st= new Stack<>();
        Stack<Integer> ind = new Stack<>();
        int ans=0;
        ind.push(-1);
        
        for(int i=0;i<S.length();i++){
            char c= S.charAt(i);
            if(c=='('){
                st.push(c);
                ind.push(i);
            } 
            else if(c==')' && !st.isEmpty()){
                st.pop();
                ind.pop();
                ans= Math.max(ans, i-ind.peek());
            }
            else ind.push(i);
        }
        
        return ans;
    }
}