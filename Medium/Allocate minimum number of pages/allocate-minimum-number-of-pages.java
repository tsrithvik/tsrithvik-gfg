//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int sum = 0 , ans = -1;
        for(int i=0;i<N;i++){
            sum += A[i];
        }
        if(N<M) return ans;
        int start=0, end= sum;
        int mid= (start+end)/2;
        
        while(start <= end){
            if(isPossible(A, N, M, mid)){
                ans = mid;
                end= mid-1;
            }
            else{
                start= mid+1;
            }
            mid= (start+end)/2;
        }
        return ans;
        
    }
    
    public static boolean isPossible(int[] A, int N, int M, int mid){
        int students = 1, pagesum = 0;
        for(int i=0;i<N;i++){
            
            if(pagesum+A[i] <= mid){
                pagesum += A[i];
            }
            else{
                students++;
                if(students > M || A[i]>mid ){
                    return false;
                }  
                pagesum = A[i];
            }
            
        }
        return true;
    }
    
    
    
    
    
};