//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static boolean palin(String S){
        int l=0;
        int h= S.length()-1;
        while(l<h){
            if(S.charAt(l)!=S.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
    String longestPalindrome(String S){
        // code here
        ArrayList<String> al= new ArrayList<>();
        int n= S.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                al.add(S.substring(i,j));
            }
        }
        String ans="";
        int max=-1;
        for(int i=0;i<al.size();i++){
            if(palin(al.get(i))==true){
                if(al.get(i).length()>max){
                    max= al.get(i).length();
                    ans= al.get(i);
                }
            }
        }
        return ans;
    }
}