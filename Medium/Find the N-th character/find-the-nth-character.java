//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        /*int c=1;
        String k="";
        //for(int j=0;j<r;j++){
          int l= s.length();
         for(int i=0;i<l;i++){
            if(s.charAt(i)=='0'){
                k+="01";
            }
            else if(s.charAt(i)=='1'){
                k+="10";
            }
            if(i==(l*c)-1){
              s=k;
              k="";
              c++;
              l= s.length();
              i=-1;
            }
        } 
        
        //j++;
        //}
        return s.charAt(n);
        */
        StringBuilder str = new StringBuilder();
        for(int i=0; i<r ; i++){
            
            
            for(int j=0 ;j<s.substring(0,n+1).length() ; j++){
                if(s.charAt(j)=='1'){
                    str.append("10");
                }
                else{
                    str.append("01");
                }
            }
             s=str.toString();
            str=new StringBuilder();
        }
        
        return s.charAt(n);
    }
}
// 1010010110100101
// 1010010110011001
// 1001100101100110
// 1001100101100110
// 01100101100110
