//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String s)
    {
        // your code here
        //String s= "i.like.this.program.very.much";
      StringBuilder ans= new StringBuilder();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            if(curr!='.'){
                st.push(curr);
            }
            else{
                while(!st.isEmpty()){
                    ans.append(st.pop());
                }
                ans.append('.');
            }
        }
        while(!st.isEmpty()){
                    ans.append(st.pop());
                }
        return ans.toString();
    }
}