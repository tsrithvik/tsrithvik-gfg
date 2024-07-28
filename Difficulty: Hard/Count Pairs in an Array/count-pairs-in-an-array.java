//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();  
            System.out.println(obj.countPairs(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {  
    static int countPairs(int arr[], int n) 
    {
         // Your code goes here
         for(int i = 0;i<n;i++){
             arr[i] = arr[i]*i;
         }
         long ans= mergeSort(arr, 0, n-1);
         return (int) ans;
         
    }
    static long merge(int a[], int l, int mid, int r)
    {
         // Your code here
         
         long inv=0;
         
         int i= l, k= 0;
         int j= mid+1;
         int[] b= new int[r-l+1];
         
         
         
         while(i<=mid && j<=r){
             if(a[i]>a[j]){
                 inv+= mid-i+1;
                 b[k++]= a[j++];
             }
             else{
                 b[k++]= a[i++];
             }
         }
         
         while(i<=mid) b[k++]= a[i++];
         while(j<=r) b[k++]= a[j++];
         
         for(int x=0;x<k;x++){
             a[l+x]= b[x];
         }
         
         return inv;
    }
    static long mergeSort(int arr[], int l, int r)
    {
        //code here
        long c=0;
        if(l<r){
            
            int mid= l+(r-l)/2;
            
            c+= mergeSort(arr, l, mid);
            c+= mergeSort(arr, mid+1, r);
            
            c+= merge(arr, l, mid, r);
        }
        
        return c;
    }
}
