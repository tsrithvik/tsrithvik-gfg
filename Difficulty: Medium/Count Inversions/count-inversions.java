//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for (long i = 0; i < n; i++) arr[(int)i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, (int)n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        long ans= mergeSort(arr, 0, n-1);
        return ans;
    }
    static long merge(long a[], int l, int mid, int r)
    {
         // Your code here
         
         long inv=0;
         
         int i= l, k= 0;
         int j= mid+1;
         long[] b= new long[r-l+1];
         while(i<=mid && j<=r){
             if(a[i]<=a[j]){
                 b[k++]= a[i++];
             }
             else{
                 b[k++]= a[j++];
                 inv+= mid+1-i;
             }
         }
         
         while(i<=mid) b[k++]= a[i++];
         while(j<=r) b[k++]= a[j++];
         
         for(int x=0;x<k;x++){
             a[l+x]= b[x];
         }
         
         return inv;
    }
    static long mergeSort(long arr[], int l, int r)
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