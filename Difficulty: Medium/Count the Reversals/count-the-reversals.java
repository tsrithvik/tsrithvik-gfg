//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        // your code here       
        
        if(s.length()%2!=0) return -1;
        Stack<Character> stack= new Stack<>();
        //stack.push(s.charAt(0));
        //int i=1;
        
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)== '}' && !stack.isEmpty()){
            if(stack.peek() == '{'){
              stack.pop();
            }
            else stack.push(s.charAt(i));
          }
          else stack.push(s.charAt(i));
        }
        
       
        double c=0, n=0, m=0;
        while(!stack.isEmpty()){
         char k= stack.pop();
         if(k=='{') n++;
         else m++;
          
        }
        c= Math.ceil(n/2)+Math.ceil(m/2);
        
        return (int)c;
    }
    
}