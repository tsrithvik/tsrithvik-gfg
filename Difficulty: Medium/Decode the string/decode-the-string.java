//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (curr == ']') {
        StringBuilder val = new StringBuilder();
        while (st.peek() != '[') {
          val.insert(0, st.pop());
        }
        st.pop(); // Remove '['
        StringBuilder num = new StringBuilder();
        while (!st.isEmpty() && Character.isDigit(st.peek())) {
          num.insert(0, st.pop());
        }
        int time = Integer.parseInt(num.toString());
        StringBuilder repeatedVal = new StringBuilder();
        for (int j = 0; j < time; j++) {
          repeatedVal.append(val);
        }
        for (char c : repeatedVal.toString().toCharArray()) {
          st.push(c);
        }
      } else {
        st.push(curr);
      }
    }
    StringBuilder ans = new StringBuilder();
    while (!st.isEmpty()) {
      ans.insert(0, st.pop());
    }
        return ans.toString();
        
        
    }
}