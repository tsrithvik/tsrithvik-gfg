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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        //String[] a= new String[n];
        if(n==1) return arr[0];
        String ans= "";
        int min=arr[0].length();
        for(int i=0;i<n-1;i++){
            String k=arr[i];
            
            String temp= "";
            
            for(int j=0;j<Math.min(arr[i].length(), arr[i+1].length());j++){
                if(arr[i].charAt(0)!=arr[i+1].charAt(0)) return "-1";
                if(k.charAt(j)==arr[i+1].charAt(j)){
                    
                    temp+= k.charAt(j);
                }
            }
            if(temp.length()<=min){
                min = temp.length();
                ans= temp;
            }
            
        }
        return ans;
    }
}