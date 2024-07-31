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
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            if(res.size()==0)
                System.out.print("-1 ");
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        int m= pat.length();
        int n= S.length();
        
        int c=0;
        
        ArrayList<Integer> al= new ArrayList<>();
        
        for(int i=0;i<=n-m;i++){
            String str= S.substring(i, i+m);
            if(str.equals(pat)){
              al.add(i+1);
              c++;
            }
        }
        
        if(n<m || al.size()==0) al.add(-1) ;
        
        return al;
    }
}