//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int n=size;
        int c=1;
        Arrays.sort(a);
        //while(j<n){
        if(n==1) return a[0];
            for(int i=0;i<n-1 ;i++){
            if(a[i]==a[i+1]){
                c++;
            }
            else c=1;
            if(c>n/2) return a[i];
        }
        //}
      return -1; 
    }
}